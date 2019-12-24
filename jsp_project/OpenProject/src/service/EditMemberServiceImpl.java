package service;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import dao.MemberDao;
import jdbc.ConnectionProvider;
import model.OpMember;

public class EditMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {
		
		String viewPage = "/WEB-INF/views/edit.jsp";
		

		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 데이터 받기
		String idx = request.getParameter("idx");
		String uid = request.getParameter("uid");
		String pw = request.getParameter("pw");
		String uname = request.getParameter("uname");
		String byear = request.getParameter("byear");
		String gender = request.getParameter("gender");
		String uphoto = request.getParameter("pfile");
		
		OpMember member = new OpMember(
				Integer.parseInt(idx), 
				uid, 
				pw, 
				uname, 
				Integer.parseInt(byear), 
				gender, 
				uphoto);
		
		System.out.println("insert Data : " + member);
		
		Connection conn = null;
		int result = 0;
		
		MemberDao dao = new MemberDao();
		
		try {
			conn = ConnectionProvider.getConnection();
			
			result = dao.editMember(conn, member);
			
			
		} catch (SQLException e) {
			result = -1;
			e.printStackTrace();
		}
		
		request.setAttribute("resultCnt", result);
		
		
		
		return viewPage;
	}

}
