package com.kite.mm.member.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class OpMember {

	private int idx;
	private String uid;
	private String pw;
	private String uname;
	private int byear;
	private String gender;
	private String uphoto;
	private MultipartFile photo;
	private Date regdate;

	public OpMember(int idx, String uid, String pw, String uname, int byear, String gender, String uphoto,
			MultipartFile photo, Date regdate) {

		this.idx = idx;
		this.uid = uid;
		this.pw = pw;
		this.uname = uname;
		this.byear = byear;
		this.gender = gender;
		this.uphoto = uphoto;
		this.photo = photo;
		this.regdate = regdate;
	}

	public OpMember() {
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

	public String getUphoto() {
		return uphoto;
	}

	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}

	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public LoginInfo toLoginInfo() {
		return new LoginInfo(idx, uid, uname, uphoto, byear, gender, regdate);
	}

	@Override
	public String toString() {
		return "OpMember [idx=" + idx + ", uid=" + uid + ", pw=" + pw + ", uname=" + uname + ", byear=" + byear
				+ ", gender=" + gender + ", uphoto=" + uphoto + ", photo=" + photo + ", regdate=" + regdate + "]";
	}
}
