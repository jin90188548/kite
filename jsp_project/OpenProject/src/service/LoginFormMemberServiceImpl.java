package service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import dao.MemberDao;
import jdbc.ConnectionProvider;
import model.OpMember;

public class LoginFormMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {
		
		String viewPage = "/WEB-INF/views/loginForm.jsp";
		
		String refferPage = request.getHeader("reffer");
		
		System.out.println("refferPage : " + refferPage);

		
		request.setAttribute("refferPage", refferPage);
		
		
		
		return viewPage;
	}

	
	
	
	
	
	
	
	
	
}
