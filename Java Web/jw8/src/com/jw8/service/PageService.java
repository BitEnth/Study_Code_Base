package com.jw8.service;
import java.util.List;

import com.jw8.DButil.Studata;

public class PageService {

	private List<Studata> students;
	private int currentPage;
	private int pageSize;
	private int totalPageNum;
	private int totalCount;
	
	public List<Studata> getStudents() {
		return students;
	}
	public void setStudents(List<Studata> students) {
		this.students = students;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPageNum() {
		return totalPageNum;
	}
	public void setTotalPageNum(int totalPageNum) {
		this.totalPageNum = totalPageNum;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public void setPageNum(int currentPage, int pageSize) {
		this.setCurrentPage(currentPage);
		this.setPageSize(pageSize);
		int temp1 = this.getTotalCount();
		int temp2 = this.getPageSize();
		this.totalPageNum = (int)Math.ceil(temp1/temp2);
	}
}
