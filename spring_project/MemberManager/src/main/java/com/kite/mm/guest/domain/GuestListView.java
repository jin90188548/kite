package com.kite.mm.guest.domain;

import java.util.List;

public class GuestListView {

	// 게시글의 리스트
	private List<GuestArticleVo> list;
	// 전체 게시글의 개수
	private int totalArticleCount;
	// 전체 페이지의 개수
	private int totalPageCount;
	// 현재 페이지
	private int currentPageNo;
	// 시작 게시물의 번호
	private int startRow;
	// 페이지 표현할 게시물의 개수
	private int countPerPage;

	public GuestListView(List<GuestArticleVo> list, int totalArticleCount, int currentPageNo, int startRow,
			int countPerPage) {
		this.list = list;
		this.totalArticleCount = totalArticleCount;
		this.currentPageNo = currentPageNo;
		this.startRow = startRow;
		this.countPerPage = countPerPage;
		
		makeTotalPageCount();
	}

	private void makeTotalPageCount() {
		// 페이지 개수 
		int cnt = 0;
		
		cnt = totalArticleCount / countPerPage;
		
		totalPageCount = totalArticleCount%countPerPage>0 ? ++cnt: cnt;
	
	}

	public List<GuestArticleVo> getList() {
		return list;
	}

	public int getTotalArticleCount() {
		return totalArticleCount;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getCountPerPage() {
		return countPerPage;
	}

	@Override
	public String toString() {
		return "GuestListView [list=" + list + ", totalArticleCount=" + totalArticleCount + ", totalPageCount="
				+ totalPageCount + ", currentPageNo=" + currentPageNo + ", startRow=" + startRow + ", countPerPage="
				+ countPerPage + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
