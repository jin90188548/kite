package com.kite.mm.member.service;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kite.mm.member.dao.MemberDaoInterface;
import com.kite.mm.member.domain.OpMember;
import com.kite.mm.member.domain.RequestMemberRegist;

@Service("registService")
public class MemberRegService implements MemberService {

	// 자동 메퍼를 이용해서 생성할 dao
	private MemberDaoInterface dao;

	// 자동 메퍼를 위한 sqlSessionTemplate 객체 주입
	// @Inject : 타입에 맞는 주입 ( java 에서 지원 : 특정 프레임워크에 의존하지 않음 )
	@Inject
	private SqlSessionTemplate template;

	public int memberInsert(HttpServletRequest request, RequestMemberRegist regist) {

		// SqlSessionTemplate getMapper 를 이용해 dao 생성
		dao = template.getMapper(MemberDaoInterface.class);

		// 서버 경로
		String path = "/uploadfile/userphoto"; // 리소스 매핑 필요
		// 절대 경로
		String dir = request.getSession().getServletContext().getRealPath(path);

		OpMember memberInfo = regist.toOpMember();

		int resultCnt = 0;

		String newFileName = "";

		MultipartFile file = regist.getPhoto();

		try {
			if (file != null && !file.isEmpty() && file.getSize() > 0) {
				// 새로운 파일 이름 생성
				// String newFileName = memberInfo.getuId()+System.nanoTime();
				newFileName = memberInfo.getUid() + "_" + file.getOriginalFilename();
				// 파일을 서버의 지정 경로에 저장
				file.transferTo(new File(dir, newFileName));
				// 데이터베이스 저장을 하기위한 파일 이름 set
				memberInfo.setUphoto(newFileName);
			} else {
				memberInfo.setUphoto("default.png");
			}

			resultCnt = dao.insertMember(memberInfo);

		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류");
			if (file != null) {
				new File(dir, newFileName).delete();
			}
		}

		return resultCnt;
	}

//	public char idCheck(String id) {
//
//		// SqlSessionTemplate getMapper 를 이용해 dao 생성
//		dao = template.getMapper(MemberDaoInterface.class);
//
//		char chk = dao.selectMemberById(id) == null ? 'Y' : 'N';
//
//		return chk;
//	}

	public String idCheck1(String id) {

		// SqlSessionTemplate getMapper 를 이용해 dao 생성
		dao = template.getMapper(MemberDaoInterface.class);

		String chk = dao.selectMemberById2(id) == null ? "Y" : "N";

		return chk;
	}

}
