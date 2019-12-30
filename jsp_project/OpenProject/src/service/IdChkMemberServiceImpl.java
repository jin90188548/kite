package service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import dao.MemberDao;
import jdbc.ConnectionProvider;

public class IdChkMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {
		
		String viewPage = "/WEB-INF/views/idChk.jsp";
		
		String uid = request.getParameter("uid");
		
		String result = "Y";
		
		// DB -> id로 검색한 결과가 있다면 result="N"
		
		MemberDao dao = new MemberDao();
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			boolean chk = dao.selectCheckId(conn, uid);
			
			if(!chk) {
				result="N";
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		request.setAttribute("result", result);
		
		return viewPage;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
