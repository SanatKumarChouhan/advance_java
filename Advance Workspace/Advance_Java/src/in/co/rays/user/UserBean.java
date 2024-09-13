package in.co.rays.user;

import java.util.Date;

public class UserBean {
	
	private int id;
	private String firstname;
	private String lastname;
	private String loginid;
	private String password;
	private Date dob;
	private String address;
	
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setFirstName(String firstname) {
		this.firstname=firstname;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public void setLastName(String lastname) {
		this.lastname=lastname;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public void setLoginId(String loginid) {
		this.loginid=loginid;
	}
	
	public String getLoginId() {
		return loginid;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setDob(Date dob) {
		this.dob=dob;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}

}
