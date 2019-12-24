package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.OpMember;

public class MemberDao {

	// 회원 정보 저장 메서드
	public int insertMember(Connection conn, OpMember member) throws SQLException {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		// 데이터 저장 SQL
		String sql = "insert into opmember values (MEMBER_IDX_SEQ.nextval, ?, ?, ?, ?, ?, ?)";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.getUid());
		pstmt.setString(2, member.getUname());
		pstmt.setString(3, member.getPw());
		pstmt.setString(4, member.getGender());
		pstmt.setInt(5, member.getByear());
		pstmt.setString(6, member.getUphoto());
		
		result = pstmt.executeUpdate();
		
		System.out.println("dao insert result : " + result);
		
		pstmt.close();
		
		
		return result;
	}

}
