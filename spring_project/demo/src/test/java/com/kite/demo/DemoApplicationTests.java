package com.kite.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kite.demo.domain.OpMember;
import com.kite.demo.mapper.MemberMapper;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	private DataSource datasource;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testConnection() throws SQLException {
		
		System.out.println(datasource);
		Connection conn = datasource.getConnection();
		System.out.println(conn);
		conn.close();
	}
	
	@Autowired
	private SqlSessionFactory sessionFactory;
	
	@Test
	public void testSqlSessionFactory() {
		System.out.println(sessionFactory);
	}
	
	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void testSelectList() {
		
		List<OpMember> members = mapper.getMemberList();
		
		for (OpMember opMember : members) {
			System.out.println(opMember);
		}
		
	}
	
	@Test
	public void testSelectMemberById() {
		OpMember om = mapper.selectMemberById("test");
		System.out.println("검색 결과  : " + om);
	}
	
	
	
	
	
	
	
	

}
