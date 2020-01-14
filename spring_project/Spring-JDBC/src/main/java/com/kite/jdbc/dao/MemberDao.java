package com.kite.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.kite.jdbc.domain.Member;
import com.kite.jdbc.domain.RequestMeberReg;

@Repository
public class MemberDao implements Dao {

	@Autowired
	JdbcTemplate template;

	public List<Member> getMemberList() {

		List<Member> members = null;
		String sql = "select * from project.member order by email";
		members = template.query(sql, new MemberRowMapperImpl());
		return members;

		// return template.query("select * from project.member", new
		// MemberRowMapperImpl());

	}

	public Member getMemberByEmail(String email) {		
		List<Member> members = template.query(
				"select * from project.member where email=?", 
				new MemberRowMapperImpl(), 
				email);		
		return members.isEmpty() ? null: members.get(0);
	}
	
	public Member MembergetMemberById(Integer id) {
		
		return template.queryForObject(
				"select * from project.member where id=?", 
				new MemberRowMapperImpl(), 
				id);
	}
	
	
	
	

	public int getMemberCount() {		
		return template.queryForObject(
				"select count(*) from project.member", 
				Integer.class);
	}

	public int insertMember(RequestMeberReg request) {
		String sql = "INSERT INTO project.member (EMAIL,PASSWORD,NAME,REGDATE) "
				   + " VALUES (?, ?, ?, now())";
		return template.update(sql, 
				request.getEmail(),
				request.getPassword(),
				request.getName());
	}
	
	public int insert(RequestMeberReg request) {
		
		KeyHolder keyHolder = new GeneratedKeyHolder();		
		template.update(
				new PreparedStatementCreator() {					
					@Override
					public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
						String sql = "INSERT INTO project.member (EMAIL,PASSWORD,NAME,REGDATE) "
								   + " VALUES (?, ?, ?, now())";
						PreparedStatement pstmt = con.prepareStatement(sql, new String[] {"id"});
						pstmt.setString(1, request.getEmail());
						pstmt.setString(2, request.getPassword());
						pstmt.setString(3, request.getName());
						return pstmt;
					}
				}, 
				keyHolder);
		
		Number keyValue = keyHolder.getKey();
		
		return keyValue.intValue();
		
	}
	
	

	
	
	
	
	
	
	/*
	 * public List<Member> getMemberList(){
	 * 
	 * List<Member> members = null;
	 * 
	 * String sql = "select * from project.member";
	 * 
	 * members = template.query(sql, new RowMapper<Member>() {
	 * 
	 * @Override public Member mapRow(ResultSet rs, int rowNum) throws SQLException
	 * {
	 * 
	 * Member member = new Member(); member.setId(rs.getInt("id"));
	 * member.setEmail(rs.getString("email")); member.setName(rs.getString("name"));
	 * member.setPassword(rs.getString("password"));
	 * member.setRegdate(rs.getDate("regdate"));
	 * 
	 * return member; }
	 * 
	 * });
	 * 
	 * 
	 * return members;
	 * 
	 * }
	 * 
	 */

}
