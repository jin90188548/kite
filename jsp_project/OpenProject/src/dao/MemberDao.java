package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

	// 회원 리스트
	public List<OpMember> getMemberList(Connection conn) throws SQLException {

		// 결과 데이터 : LIST
		List<OpMember> list = new ArrayList<OpMember>();

		Statement stmt = null;
		ResultSet rs = null;

		stmt = conn.createStatement();

		// 회원 리스트 SQL
		String sql = "select * from opmember order by idx";

		// 쿼리 실행 결과
		rs = stmt.executeQuery(sql);

		while (rs.next()) {			
			// 객체를 List에 저장
			list.add(makeOpMember(rs));
		}

		return list;
	}

	private OpMember makeOpMember(ResultSet rs) throws SQLException {

		int idx = rs.getInt("idx");
		String uname = rs.getString("uname");
		String uid = rs.getString("uemail");
		String pw = rs.getString("upw");
		String gender = rs.getString("gender");
		int byear = rs.getInt("byear");
		String uphoto = rs.getString("uphoto");

		// 데이터를 객체에 저장
		OpMember member = new OpMember(idx, uid, pw, uname, byear, gender, uphoto);
		
		return member;

	}

	// idx로 회원 정보 검색
	public OpMember selectByIdx(Connection conn, int idx) throws SQLException {
		
		OpMember member = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs ;
		
		String sql = "select * from opmember where idx=?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);
		
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			member = makeOpMember(rs);
		}
		
		
		return member;
	}

	public int editMember(Connection conn, OpMember member) throws SQLException {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "update opmember set "
				+ " uname=?, upw=?, gender=?, byear=? WHERE idx=?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.getUname());
		pstmt.setString(2, member.getPw());
		pstmt.setString(3, member.getGender());
		pstmt.setInt(4, member.getByear());
		pstmt.setInt(5, member.getIdx());
		
		result = pstmt.executeUpdate();
		
		
		return result;
	}

	public int deleteMemberByIdx(Connection conn, int idx) throws SQLException {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		String sql = "delete from opmember where idx=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);
		
		result = pstmt.executeUpdate();
		
		
		return result;
	}



	public OpMember selectByUserIdPw(Connection conn, String uid, String pw) throws SQLException {
		OpMember member = null;
		PreparedStatement pstmt = null;
		
		String sql = "select * from opmember where uemail=? and pw=?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, uid); 
		pstmt.setString(2, pw); 
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			member = makeOpMember(rs);
		}
		
		return member;
	}

	
	
	
	
	
	
	
	
}
