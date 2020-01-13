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
	
	public List<Member> getMemberList(){
		
		List<Member> members = null;
		
		String sql = "select * from project.member";
		
		members = template.query(sql, new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Member member = new Member();
				member.setId(rs.getInt("id"));
				member.setEmail(rs.getString("email"));
				member.setName(rs.getString("name"));
				member.setPassword(rs.getString("password"));
				member.setRegdate(rs.getDate("regdate"));
				
				return member;
			}

			});
		
		
		return members;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
