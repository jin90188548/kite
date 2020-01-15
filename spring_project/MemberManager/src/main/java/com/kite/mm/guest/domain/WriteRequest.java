package com.kite.mm.guest.domain;

public class WriteRequest {

	private int writer;
	private String title;
	private String content;

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
		return "WriteRequest [writer=" + writer + ", title=" + title + ", content=" + content + "]";
	}

}
