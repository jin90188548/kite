package service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import model.OpMember;

public class KakaoLoginMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {
		
		String viewPage = "/WEB-INF/views/kakaoLogin.jsp";
				
		// kakao api 를 통해서 받은 데이터를 이용해서 
		// OpMember 객체를 생성 -> Session 속성에 loginInfo이름으로 저장
		
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String uname = request.getParameter("nicname");
		String uid = request.getParameter("email");
		String byear = request.getParameter("bday");
		String gender = request.getParameter("gender");
		String photo = request.getParameter("photo");
		
		String result = "fail";
		
		// 카카오 정보로 사용자 객체 생성
		OpMember member = new OpMember(0, uid, null, uname, Integer.parseInt(byear), gender, photo);
		
		// 세션에 사용자 정보를 입력해서 로그인 처리
		request.getSession(false).setAttribute("loginInfo", member);
		
		result = "login";
		
		request.setAttribute("result", result);
		
		
		
		
		
		return viewPage;
	}

}
