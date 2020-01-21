package com.kite.mvc.domain;

public class MemberVo {

	private int id;
	private String name;
	private String email;
	private String photo;

	public MemberVo(int id, String name, String email, String photo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.photo = photo;
	}
	
	
	

	public MemberVo() {
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", name=" + name + ", email=" + email + ", photo=" + photo + "]";
	}
	
	

}
