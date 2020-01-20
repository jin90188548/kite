package com.kite.mm.member.domain;

import java.util.Date;

public class LoginInfo {

	private int idx;
	private String uid;
	private String uname;
	private String uphoto;
	private int byear;
	private String gender;
	private Date regDate;

	public LoginInfo(int idx, String uid, String uname, String uphoto, int byear, String gender, Date regDate) {
		super();
		this.idx = idx;
		this.uid = uid;
		this.uname = uname;
		this.uphoto = uphoto;
		this.byear = byear;
		this.gender = gender;
		this.regDate = regDate;
	}

	public LoginInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUphoto() {
		return uphoto;
	}

	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}

	public int getByear() {
		return byear;
	}

	public void setByear(int byear) {
		this.byear = byear;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "LoginInfo [idx=" + idx + ", uid=" + uid + ", uname=" + uname + ", uphoto=" + uphoto + ", byear=" + byear
				+ ", gender=" + gender + ", regDate=" + regDate + "]";
	}

	
}
