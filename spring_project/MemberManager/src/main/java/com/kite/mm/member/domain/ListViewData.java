package com.kite.mm.member.domain;

import java.util.List;

public class ListViewData {
	
	private List<OpMember> memberList;
	private int totalCount ;
	private int no;
	private int currentPageNumber;
	private int pageTotalCount;

	public List<OpMember> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<OpMember> memberList) {
		this.memberList = memberList;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

	public void setCurrentPageNumber(int currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}

	public int getPageTotalCount() {
		return pageTotalCount;
	}

	public void setPageTotalCount(int pageTotalCount) {
		this.pageTotalCount = pageTotalCount;
	}
	
	
	
	
	
	
	
	
	

}
