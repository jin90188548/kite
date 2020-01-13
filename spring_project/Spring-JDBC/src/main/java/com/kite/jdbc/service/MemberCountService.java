package com.kite.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.jdbc.dao.MemberDao;

@Service
public class MemberCountService {

	@Autowired
	MemberDao dao;
	
	public int getMemberCount() {
		
		return dao.getMemberCount();
		
	}
	
	
	
	
	
	
	
}
