package com.kite.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.jdbc.dao.MemberDao;
import com.kite.jdbc.domain.Member;

@Service
public class MemberViewService {

	@Autowired
	MemberDao dao;

	public Member getMember(String email) {		
		return dao.getMemberByEmail(email);
	}
	
	public Member getMember(int id) {
		return dao.MembergetMemberById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
