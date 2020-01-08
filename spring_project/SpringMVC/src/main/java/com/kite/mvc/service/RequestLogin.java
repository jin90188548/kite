package com.kite.mvc.service;

public class RequestLogin {

	private String uid;
	private String pw;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "RequestLogin [uid=" + uid + ", pw=" + pw + "]";
	}

}
