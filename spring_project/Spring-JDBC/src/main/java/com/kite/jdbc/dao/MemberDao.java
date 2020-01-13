package com.kite.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kite.jdbc.domain.Member;

@Repository
public class MemberDao implements Dao {

	@Autowired
	JdbcTemplate template;

	public List<Member> getMemberList() {

		List<Member> members = null;
		String sql = "select * from project.member";
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

	public int getMemberCount() {		
		return template.queryForObject(
				"select count(*) from project.member", 
				Integer.class);
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
