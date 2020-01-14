package com.kite.jdbc.dao;

import java.util.List;
import java.util.Map;

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
	
	// 회원 전체 리스트
	public List<Member> selectMemberList(){
		return session.selectList(ns+".selectList");
	}
	
	// 이메일로 검색한 결과
	public Member selectByEmail(String email) {		
		//Member member = session.selectOne(ns+".selectByEmail", email);		
		return session.selectOne(ns+".selectByEmail", email);
	}
	
	public Member selectById(Integer id) {
		return session.selectOne(ns+".selectById", id);
	}
	
	// 회원 정보 입력
	public int insertMember(RequestMeberReg request) {
		return session.insert(ns+".insertMember", request);
	}

	public int editMember(Member member) {		
		return session.update(ns+".updateMember", member);
	}
	
	// 회원 정보 삭제
	public int deleteMember(int id) {
		return session.delete(ns+".deleteMember", id);
	}

	public List<Member> searchList(Map<String, String> map) {		
		return session.selectList(ns+".list", map);
	}
	
	
	
	
	
	
	
	
	
	
}
