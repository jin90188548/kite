package com.kite.mm.member.domain;

import org.springframework.web.multipart.MultipartFile;

public class RequestMemberRegist {

	private String uid;
	private String pw;
	private String uname;
	private int byear;
	private String gender;
	private MultipartFile photo;

	public RequestMemberRegist(String uid, String pw, String uname, int byear, String gender, MultipartFile photo) {
		super();
		this.uid = uid;
		this.pw = pw;
		this.uname = uname;
		this.byear = byear;
		this.gender = gender;
		this.photo = photo;
	}

	public RequestMemberRegist() {
		super();
		// TODO Auto-generated constructor stub
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

	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
	
	public OpMember toOpMember() {
		return new OpMember(0, uid, pw, uname, byear, gender, null, photo, null);
	}
	

	@Override
	public String toString() {
		return "RequestMemberRegist [uid=" + uid + ", pw=" + pw + ", uname=" + uname + ", byear=" + byear + ", gender="
				+ gender + ", photo=" + photo + "]";
	}

}
