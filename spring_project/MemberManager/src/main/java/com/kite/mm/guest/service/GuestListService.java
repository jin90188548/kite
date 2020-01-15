package com.kite.mm.guest.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.guest.dao.GuestDao;
import com.kite.mm.guest.domain.GuestArticleVo;
import com.kite.mm.guest.domain.GuestListView;

@Service
public class GuestListService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	private GuestDao dao;
	
	// 한 페이지 표현될 게시글의 개수
	private final int COUNT_PER_PAGE = 4;  
	
	public GuestListView getListView(int pageNo) {
		
		dao = template.getMapper(GuestDao.class);
		
		// 시작 게시글의 위치 startRow
		int startRow = (pageNo-1)*COUNT_PER_PAGE;
		
		// 페이지 표현할 게시글의 리스트
		List<GuestArticleVo> list = dao.selectArticleList(startRow, COUNT_PER_PAGE);
				
		// 전체 게시글의 개수
		int totalArticleCount = dao.selectCount();
		
		GuestListView listView = new GuestListView(
				list, 
				totalArticleCount, 
				pageNo, 
				startRow, 
				COUNT_PER_PAGE);
		
		return listView;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
