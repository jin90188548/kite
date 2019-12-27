package service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import dao.MemberDao;
import jdbc.ConnectionProvider;

public class DeleteMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {
		
		String viewPage = "/WEB-INF/views/delete.jsp";
		
		String idx = request.getParameter("midx");
		
		Connection conn = null;
		
		MemberDao dao = new MemberDao();
		
		int result = 0;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			result = dao.deleteMemberByIdx(conn, Integer.parseInt(idx));
			
		} catch (SQLException e) {
			result = -1;
			e.printStackTrace();
		}
		
		request.setAttribute("resultCnt", result);
		
		return viewPage;
	}

}
