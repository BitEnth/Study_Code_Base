package com.jw6;

public class LoginData {
	
	private String userID;
	private String userName;
	private String userPwd;
	
	public LoginData() {
		
	}
	
	public LoginData(String argName, String argPwd) {
		setUserName(argName);
		setUserPwd(argPwd);
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
}
