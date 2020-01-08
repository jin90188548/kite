package com.kite.op.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.op.dao.MemberDao;
import com.kite.op.domain.OpMember;
import com.kite.op.jdbc.ConnectionProvider;

@Service
public class ListMemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDao dao;

	public List<OpMember> getMemberList() {
		
		List<OpMember> members = null ;
		
		Connection conn = null;
		
		try {
			
			conn = ConnectionProvider.getConnection();
			
			members = dao.getMemberList(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return members;
	}

	
	
}







