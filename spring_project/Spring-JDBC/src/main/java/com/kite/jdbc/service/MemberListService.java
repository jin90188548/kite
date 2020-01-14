package com.kite.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.jdbc.dao.MemberDao;
import com.kite.jdbc.dao.MemberMybatisDao;
import com.kite.jdbc.domain.Member;

@Service
public class MemberListService {

	@Autowired
	MemberDao dao;
	
	@Autowired
	MemberMybatisDao mDao;

	public List<Member> getMemberList() {
		
		List<Member> members = dao.getMemberList();
		
		return members;
	}

	public List<Member> getList() {
		
		List<Member> members = mDao.selectMemberList();
		
		return members;
	}
	
	
}
