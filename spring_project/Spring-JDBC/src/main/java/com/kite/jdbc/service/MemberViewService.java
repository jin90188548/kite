package com.kite.jdbc.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.jdbc.dao.MemberDao;
import com.kite.jdbc.dao.MemberDaoInterface;
import com.kite.jdbc.dao.MemberMybatisDao;
import com.kite.jdbc.domain.Member;

@Service
public class MemberViewService {

	@Autowired
	MemberDao dao;
	
	@Autowired
	MemberMybatisDao mDao;
	
	@Autowired
	SqlSessionTemplate template;
	
	MemberDaoInterface iDao;
	
	
	

	public Member getMember(String email) {		
		return dao.getMemberByEmail(email);
	}
	
	public Member getMember(int id) {
		return dao.MembergetMemberById(id);
	}
	


	public Member getMembers(String email) {
		
		iDao = template.getMapper(MemberDaoInterface.class);
		
		return iDao.getMemberByEmail(email);
		
		
		//return mDao.selectByEmail(email);
	}
	
	public Member getMembers(int id) {
		
		iDao = template.getMapper(MemberDaoInterface.class);
		
		
		return iDao.getMemberById(id);
		//return mDao.selectById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
