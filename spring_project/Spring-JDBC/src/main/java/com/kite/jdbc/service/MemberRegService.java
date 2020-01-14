package com.kite.jdbc.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.jdbc.dao.MemberDao;
import com.kite.jdbc.dao.MemberDaoInterface;
import com.kite.jdbc.dao.MemberMybatisDao;
import com.kite.jdbc.domain.RequestMeberReg;

@Service
public class MemberRegService {
	
	@Autowired	
	MemberDao dao;
	
	@Autowired
	MemberMybatisDao mDao;
	
	@Autowired
	SqlSessionTemplate template;
	
	MemberDaoInterface iDao;
	
	
	
	public int regMember(RequestMeberReg request) {
		return dao.insertMember(request);
		//return dao.insert(request);
	}

	public Object registMember(RequestMeberReg request) {
		
		iDao = template.getMapper(MemberDaoInterface.class);
		return iDao.insertMember(request);
		//return mDao.insertMember(request);
	}

	
	
	
	
	
	
	
	
	
}
