package com.jw11.data;

public class StuData {
	
	private int stuID;
	private String stuName;
	private int stuAge;
	private String stuMajor;
	
	public StuData() {};
	
	public StuData(int stuID, String stuName, int stuAge, String stuMajor) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuMajor = stuMajor;
	}
	
	public int getStuID() {
		return stuID;
	}
	
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	public int getStuAge() {
		return stuAge;
	}
	
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
	public String getStuMajor() {
		return stuMajor;
	}
	
	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}
	
	public String Output() {
		String str = getStuID() + "-----" + getStuName() + "-----" + getStuAge() + "-----" + getStuMajor();
		return str;
	}
}
