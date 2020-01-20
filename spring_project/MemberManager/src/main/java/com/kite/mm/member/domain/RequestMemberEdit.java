package com.kite.mm.member.domain;

import org.springframework.web.multipart.MultipartFile;

public class RequestMemberEdit {

	private int idx;
	private String uid;
	private String pw;
	private String uname;
	private int byear;
	private String gender;
	private MultipartFile uPhoto;
	private String oldFile;

	

	public RequestMemberEdit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestMemberEdit(int idx, String uid, String pw, String uname, int byear, String gender,
			MultipartFile uPhoto, String oldFile) {
		super();
		this.idx = idx;
		this.uid = uid;
		this.pw = pw;
		this.uname = uname;
		this.byear = byear;
		this.gender = gender;
		this.uPhoto = uPhoto;
		this.oldFile = oldFile;
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

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
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

	public MultipartFile getuPhoto() {
		return uPhoto;
	}

	public void setuPhoto(MultipartFile uPhoto) {
		this.uPhoto = uPhoto;
	}

	public String getOldFile() {
		return oldFile;
	}

	public void setOldFile(String oldFile) {
		this.oldFile = oldFile;
	}

	

	@Override
	public String toString() {
		return "RequestMemberEdit [idx=" + idx + ", uid=" + uid + ", pw=" + pw + ", uname=" + uname + ", byear=" + byear
				+ ", gender=" + gender + ", uPhoto=" + uPhoto + ", oldFile=" + oldFile + "]";
	}

	public OpMember toOpMember() {

		return new OpMember(idx, uid, pw, uname, byear, gender, null, uPhoto, null);

	}

}
