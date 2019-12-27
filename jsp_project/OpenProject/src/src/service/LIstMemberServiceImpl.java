package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import dao.MemberDao;
import jdbc.ConnectionProvider;
import model.OpMember;

public class LIstMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {
		
		String viewPage = "/WEB-INF/views/member_list.jsp";
		
		// 결과 데이터
		List<OpMember> list = null;		 
		
		MemberDao dao = new MemberDao();
		
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			list = dao.getMemberList(conn);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("memberList", list);
		
		for (OpMember opMember : list) {
			System.out.println(opMember);
		}		
		
		
		return viewPage;
	}

}
