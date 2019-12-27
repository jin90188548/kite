package service;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import dao.MemberDao;
import jdbc.ConnectionProvider;
import model.OpMember;

public class LoginMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {
		
		// 사용자 요청 데이터를 받는다.
		// DAO에 저장 요청 -> DAO 클래스 생성 , 기능 메서드를 생성 
		// Connection 객체를 생성해서 메서드에 전달 
		// DAO 의 응답은 처리 횟수 : 결과 데이터 -> view 전달 request에 저장
		// view 응답 데이터를 받아서 
		
		String viewPage = "/WEB-INF/views/login.jsp";
		
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 데이터 받기
		String uid = request.getParameter("uid");
		String pw = request.getParameter("pw");
		String refferPage = request.getParameter("refferPage");
		
		String reffer = "/";
		
		if(refferPage != null) {
			reffer = refferPage;
		}

		
		Connection conn = null ;
		
		MemberDao dao = new MemberDao();
		
		boolean loginChk = false;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			OpMember member = dao.selectByUserIdPw(conn, uid, pw);
			
			if(member != null) {
				
				// 세션데이터에 비밀번호는 저장하지 않습니다.
				member.setPw(null);
				request.getSession(false).setAttribute("loginInfo", member);
				
				loginChk = true ;
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
		}
		
		request.setAttribute("loginChk", loginChk);	
		request.setAttribute("refferPage", reffer);
		
		return viewPage;
	}

}
