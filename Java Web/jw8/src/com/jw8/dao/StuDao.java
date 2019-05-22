package com.jw8.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jw8.DButil.Studata;

public class StuDao implements IStuDao {

	private final String JAR = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/test1";
	private final String USER = "root";
	private final String PASSWD = "s1D5409pv";
	
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rst = null;
		int count = 0;
		try {
			Class.forName(JAR);
			con = DriverManager.getConnection(URL, USER, PASSWD);
			String sql = "select count(*) from stu_info";
			pstm = con.prepareStatement(sql);
			rst = pstm.executeQuery();
			if(rst.next()) {
				count = rst.getInt(1);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rst != null) rst.close();
				if(con != null) con.close();
				if(pstm != null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	@Override
	public List<Studata> query_stuByPage(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		List<Studata> students = new ArrayList<Studata>();
		Studata stu = null;
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rst = null;
		try {
			Class.forName(JAR);
			con = DriverManager.getConnection(URL, USER, PASSWD);
			String sql = "select * from stu_info limit ?, ?";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, (currentPage-1)*pageSize);
			pstm.setInt(2, pageSize);
			rst = pstm.executeQuery();
			while(rst.next()) {
				int id = rst.getInt("stuID");
				String name = rst.getString("stuName");
				int age = rst.getInt("stuAge");
				String major = rst.getString("stuMajor");
				stu = new Studata(id, name, age, major);
				students.add(stu);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rst != null) rst.close();
				if(con != null) con.close();
				if(pstm != null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return students;
	}

}
