package service;

import javax.servlet.http.HttpServletRequest;

public class LogoutMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {
		
		String viewPage = "/WEB-INF/views/logout.jsp";
		
		request.getSession(false).invalidate();
		
		return viewPage;
	}

}
