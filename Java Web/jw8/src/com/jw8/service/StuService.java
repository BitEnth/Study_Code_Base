package com.jw8.service;
import com.jw8.dao.StuDao;

import java.util.ArrayList;
import java.util.List;

import com.jw8.DButil.Studata;

public class StuService {

	public int GetTotalCount() {
		StuDao sd = new StuDao();
		return sd.getTotalCount();
	}
	
	public List<Studata> QueryStuByPage(int pageNo, int pageSize){
		List<Studata> stus = new ArrayList<Studata>();
		StuDao sd = new StuDao();
		stus = sd.query_stuByPage(pageNo, pageSize);
		return stus;
	}
}
