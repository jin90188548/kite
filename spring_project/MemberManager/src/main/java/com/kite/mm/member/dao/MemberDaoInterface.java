package com.kite.mm.member.dao;

import java.util.List;
import java.util.Map;

import com.kite.mm.member.domain.OpMember;
import com.kite.mm.member.domain.SearchParam;

public interface MemberDaoInterface {
	
	// 회원 로그인처리시
	public OpMember selectMemberById(String userId, String pw);
	// 아이디 중복 체크
	public OpMember selectMemberById2(String userId);
	// 회원가입
	public int insertMember(OpMember memberInfo);
	// 회원 정보 수정을 위한 정보 획득
	public OpMember selectMemberByIdx(int id);
	// 회원 정보 수정
	public int memberUpdate(OpMember memberInfo);
	// 회원 정보 삭제
	public int memberDelete(int id);
	
	// 이전 dao에서는 검색 처리를 위한 여러개의 메서드가 필요.	
	// 게시물의 개수 : 동적 쿼리로 검색의 결과 까지 처리
	public int selectTotalCount(SearchParam searchParam);
	// 게시물의 LIST :  동적 쿼리로 검색의 결과 까지 처리
	//public List<MemberInfo> selectList(int index, int count);
	public List<OpMember> selectList(Map<String, Object> params);
	// 회원의 전체 리스트 
	public List<OpMember> selectAllList();
	
	
	
	
	
	
	
	
	
}
