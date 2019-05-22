package com.jw7.service;
import java.util.List;

import com.jw7.dao.StuInfoDAO;
import com.jw7.unity.StuData;

public class StuOperate {
	
	public boolean isExist(int stuid) {
		boolean flag = false;
		StuInfoDAO sid = new StuInfoDAO();
		StuData stu = null;
		stu = sid.query_stubyid(stuid);
		if(stu != null) {
			flag = true;
		}
		return flag;
	}
	
	public boolean AddStudent(StuData stu) {
		boolean flag = false;
		if(!isExist(stu.getStuID())) {
			StuInfoDAO sid = new StuInfoDAO();
			flag = sid.add_stu(stu);
		}
		return flag;
	}
	
	public boolean UpdateStudent(StuData stu) {
		boolean flag = false;
		if(isExist(stu.getStuID())) {
			StuInfoDAO sid = new StuInfoDAO();
			flag = sid.update_stu(stu);
		}
		return flag;
	}
	
	public boolean DeleteStudent(int stuid) {
		boolean flag = false;
		if(isExist(stuid)) {
			StuInfoDAO sid = new StuInfoDAO();
			flag = sid.delete_stu(stuid);
		}
		return flag;
	}
	
	public List<StuData> QueryStuByName(String stuname){
		StuInfoDAO sid = new StuInfoDAO();
		List<StuData> stus = sid.query_stubyname(stuname);
		return stus;
	}
	
	public StuData QueryStuByID(int stuid) {
		StuData stu = null;
		StuInfoDAO sid = new StuInfoDAO();
		stu = sid.query_stubyid(stuid);
		return stu;
	}
	
}
