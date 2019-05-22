package jw1;

public class UserBean {
	private String userName;
	private String password;
	private String email;
	
	public void setUserName(String name) {
		this.userName = name;
	}
	public void setPassword(String passwd) {
		this.password = passwd;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
}
