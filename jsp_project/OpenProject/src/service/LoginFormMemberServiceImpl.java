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
		
		String refererPage = request.getHeader("referer");
		
		System.out.println("referer : " + refererPage);

		
		request.setAttribute("referer", refererPage);
		
		
		
		return viewPage;
	}

	
	
	
	
	
	
	
	
	
}
