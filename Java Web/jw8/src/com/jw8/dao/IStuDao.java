package com.jw8.dao;

import java.util.List;
import com.jw8.DButil.Studata;

public interface IStuDao {

	public int getTotalCount();
	public List<Studata> query_stuByPage(int currentPage, int pageSize);
}
