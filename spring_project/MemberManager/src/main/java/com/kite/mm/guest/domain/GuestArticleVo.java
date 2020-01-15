package com.kite.mm.guest.domain;

import java.sql.Date;

public class GuestArticleVo {

	private int idx;
	private String writer;
	private String title;
	private String content;
	private Date regdate;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	// ${writeDate} --> getWriteDate()
	public java.util.Date getWriteDate(){
		return new java.util.Date(regdate.getTime());
	}
	
	@Override
	public String toString() {
		return "GuestArticleVo [idx=" + idx + ", writer=" + writer + ", title=" + title + ", content=" + content
				+ ", regdate=" + regdate + "]";
	}
	
	
	
	
	
}
