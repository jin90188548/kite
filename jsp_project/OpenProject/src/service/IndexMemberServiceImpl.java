package service;

import javax.servlet.http.HttpServletRequest;

public class IndexMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {
		
		// View 페이지
		String viewPage = "/WEB-INF/views/index.jsp";
		
		String msg = "환영합니다.";
		
		request.setAttribute("msg", msg);
		
		
		return viewPage;
	}

}
