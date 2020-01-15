package com.kite.mm.guest.dao;

import com.kite.mm.guest.domain.WriteRequest;

public interface GuestDao {
	
	// 방명록에 글 데이터 입력
	public int insertArticle(WriteRequest request);

}
