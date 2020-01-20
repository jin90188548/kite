package com.kite.mm.member.domain;

public class SearchParam {
	
	private String stype;
	private String keyword;
	
	
	public String getStype() {
		return stype;
	}
	public void setStype(String stype) {
		this.stype = stype;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "SearchParam [stype=" + stype + ", keyword=" + keyword + "]";
	}
	
	
	
	

}
