package com.kite.mm.guest.dao;

import java.util.List;

import com.kite.mm.guest.domain.GuestArticleVo;
import com.kite.mm.guest.domain.WriteRequest;

public interface GuestDao {
	
	// 방명록에 글 데이터 입력
	public int insertArticle(WriteRequest request);
	// 게시글의 리스트
	public List<GuestArticleVo> selectArticleList(int startRow, int count);
	// 전체 게시글의 개수
	public int selectCount();
	// idx 값으로 한개의 게시물 받기
	public GuestArticleVo selectGuestByIdx(int idx);
	// idx 값으로 한개의 게시물의 데이터 수정
	public int editArticle(WriteRequest request);
	// idx로 게시물 삭제
	public int deleteArticle(int idx);

}










