package com.kite.mm.member.service;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.kite.mm.member.dao.MemberDaoInterface;
import com.kite.mm.member.domain.OpMember;
import com.kite.mm.member.domain.RequestMemberEdit;

@Service("editService")
public class MemberEditService implements MemberService {

	// 자동 메퍼를 이용해서 생성할 dao
	private MemberDaoInterface dao;

	// 자동 메퍼를 위한 sqlSessionTemplate 객체 주입
	// @Inject : 타입에 맞는 주입 ( java 에서 지원 : 특정 프레임워크에 의존하지 않음 )
	@Inject
	private SqlSessionTemplate template;

	public OpMember getEditFormData(int id) {

		// SqlSessionTemplate getMapper 를 이용해 dao 생성
		dao = template.getMapper(MemberDaoInterface.class);

		OpMember memberInfo = dao.selectMemberByIdx(id);
		return memberInfo;
	}

	public int edit(RequestMemberEdit edit, String oldFileName, HttpServletRequest request) {

		// SqlSessionTemplate getMapper 를 이용해 dao 생성
		dao = template.getMapper(MemberDaoInterface.class);

		int rCnt = 0;
		OpMember memberInfo = edit.toOpMember();

		String path = "/uploadfile/userphoto";
		String dir = request.getSession().getServletContext().getRealPath(path);

		// 신규 파일 체크
		if (edit.getuPhoto() != null && !edit.getuPhoto().isEmpty() && edit.getuPhoto().getSize() > 0) {

			String newFileName = edit.getUid() + "_" + edit.getuPhoto().getOriginalFilename();

			try {
				// 신규파일 저장
				edit.getuPhoto().transferTo(new File(dir, newFileName));
				// 데이터 베이스 저장을 위한 새로운 파일 이름
				memberInfo.setUphoto(newFileName);
				// 이전 파일 삭제
				new File(dir, oldFileName).delete();

			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			// 신규파일이 없으면 이전 파일 이름을 그대로 업데이트
			memberInfo.setUphoto(oldFileName);
		}

		rCnt = dao.memberUpdate(memberInfo);

		return rCnt;
		
	}

}
