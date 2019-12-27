package service;

import javax.servlet.http.HttpServletRequest;

public class MyPageMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {
		
		// View 페이지
		String viewPage = "/WEB-INF/views/myPage.jsp";
		
		return viewPage;
	}

}
