package com.kite.mm.member.service;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

/*
	수정일 : 2019.08.21 
	작성자 : 유영진  
	수정 내용  : 인증 상태를 3개 상태로 구분	해서 return, return type 변경
			   boolean -> int
		 	  	0 - 로그인 실패
				1 - 미인증 계정 로그인	
				2 - 정상 로그인
*/
import com.kite.mm.member.dao.MemberDaoInterface;
import com.kite.mm.member.domain.OpMember;

@Service("loginService")
public class MemberLoginService implements MemberService {

	// @Autowired
	// private MemberJdbcTemplateDao dao;

	// 자동 메퍼를 이용해서 생성할 dao
	private MemberDaoInterface dao;

	// 자동 메퍼를 위한 sqlSessionTemplate 객체 주입
	// @Inject : 타입에 맞는 주입 ( java 에서 지원 : 특정 프레임워크에 의존하지 않음 )
	@Inject
	private SqlSessionTemplate template;

	public int login(String id, String pw, HttpServletRequest request) {

		// SqlSessionTemplate getMapper 를 이용해 dao 생성
		dao = template.getMapper(MemberDaoInterface.class);

		// 변수 타입 변경 boolean -> int
		// 0 : 로그인 실패
		// 1 : 미인증 로그인
		// 2 : 로그인 정상 처리
		int loginChk = 0;

		OpMember memberInfo = null;

		memberInfo = dao.selectMemberById(id, pw);

		if (memberInfo != null) {

			request.getSession(true).setAttribute("loginInfo", memberInfo.toLoginInfo());
			loginChk = 2;
		}

		return loginChk;

	}

}
