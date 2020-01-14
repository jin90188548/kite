package com.kite.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.jdbc.dao.MemberMybatisDao;

@Service
public class MemberDeleteService {
	
	@Autowired
	MemberMybatisDao mDao;

	public int deleteMember(int id) {
		return mDao.deleteMember(id);
	}
	
	
	
	
	
}
