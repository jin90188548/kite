package com.kite.jdbc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kite.jdbc.domain.Member;
import com.kite.jdbc.domain.RequestMeberReg;

@Repository
public class MemberMybatisDao implements Dao {

	@Autowired
	SqlSessionTemplate session;
	
	private String ns = "com.kite.jdbc.mapper.mybatis.MemberMapper";
	
	public List<Member> selectMemberList(){
		return session.selectList(ns+".selectList");
	}

	public int insertMember(RequestMeberReg request) {
		
		return session.insert(ns+".insertMember", request);
	}
	
	
	
	
	
	
	
	
	
	
}
