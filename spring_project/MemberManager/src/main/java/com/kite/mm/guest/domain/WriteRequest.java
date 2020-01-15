package com.kite.mm.guest.domain;

public class WriteRequest {

	private int idx;
	private int writer;
	private String title;
	private String content;

	
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getWriter() {
		return writer;
	}

	public void setWriter(int writer) {
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

	@Override
	public String toString() {
		return "WriteRequest [idx=" + idx + ", writer=" + writer + ", title=" + title + ", content=" + content + "]";
	}

	
}
