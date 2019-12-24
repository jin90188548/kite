package service;

import javax.servlet.http.HttpServletRequest;

public class RegFormMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {
		
		return "/WEB-INF/views/memberRegForm.jsp";
	}

}
