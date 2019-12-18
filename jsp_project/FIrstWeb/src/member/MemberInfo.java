package member;

public class MemberInfo {

	private String uid;
	private String pw;
	private String uname;
	private String gender;
	private int byear;
	
	public MemberInfo(String uid, String pw, String uname, String gender, int byear) {
		super();
		this.uid = uid;
		this.pw = pw;
		this.uname = uname;
		this.gender = gender;
		this.byear = byear;
	}

	public MemberInfo() {
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
	
	
	
	
	
	
	
	
	
	
}
