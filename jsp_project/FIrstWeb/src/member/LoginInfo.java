package member;

public class LoginInfo {
	
	private String name;
	private String id;
	private String gender;
	private int byear;
	
	public LoginInfo() {}
	
	public LoginInfo(String name, String id, String gender, int byear) {
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.byear = byear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getByear() {
		return byear;
	}

	public void setByear(int byear) {
		this.byear = byear;
	}

	@Override
	public String toString() {
		return "LoginInfo [name=" + name + ", id=" + id + ", gender=" + gender + ", byear=" + byear + "]";
	}
	
	
	
	
	
	

}
