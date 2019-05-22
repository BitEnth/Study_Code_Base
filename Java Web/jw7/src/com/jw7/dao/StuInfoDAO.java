package com.jw7.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jw7.unity.StuData;

public class StuInfoDAO {

	private final String JAR = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/test1";
	private final String USER = "root";
	private final String PASSWD = "s1D5409pv";
	
	public boolean add_stu(StuData stu) {
		boolean flag = false;
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			Class.forName(JAR);
			con = DriverManager.getConnection(URL, USER, PASSWD);
			String sql = "insert into stu_info values (?, ?, ?, ?)";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, stu.getStuID());
			pstm.setString(2, stu.getStuName());
			pstm.setInt(3, stu.getStuAge());
			pstm.setString(4, stu.getStuMajor());
			int count = pstm.executeUpdate();
			if(count > 0) {
				flag = true;
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
				if(con != null) con.close();
				if(pstm != null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public StuData query_stubyid(int stuid) {
		StuData stu = null;
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rst = null;
		try {
			Class.forName(JAR);
			con = DriverManager.getConnection(URL, USER, PASSWD);
			String sql = "select * from stu_info where stuID=?";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, stuid);
			rst = pstm.executeQuery();
			if(rst.next()) {
				int id = rst.getInt("stuID");
				String name = rst.getString("stuName");
				int age = rst.getInt("stuAge");
				String major = rst.getString("stuMajor");
				stu = new StuData(id, name, age, major);
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
		return stu;
	}
	
	public List<StuData> query_stubyname(String stuname){
		List<StuData> students = new ArrayList<StuData>();
		StuData stu = null;
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rst = null;
		try {
			Class.forName(JAR);
			con = DriverManager.getConnection(URL, USER, PASSWD);
			String sql = "select * from stu_info where stuName like ?";
			pstm = con.prepareStatement(sql);
			String stemp = "%" + stuname + "%";
			pstm.setString(1, stemp);
			rst = pstm.executeQuery();
			while(rst.next()) {
				int id = rst.getInt("stuID");
				String name = rst.getString("stuName");
				int age = rst.getInt("stuAge");
				String major = rst.getString("stuMajor");
				stu = new StuData(id, name, age, major);
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
	
	public boolean update_stu(StuData stu) {
		boolean flag = false;
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			Class.forName(JAR);
			con = DriverManager.getConnection(URL, USER, PASSWD);
			String sql = "update stu_info set stuName=?,stuAge=?,stuMajor=? where stuID=?";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, stu.getStuName());
			pstm.setInt(2, stu.getStuAge());
			pstm.setString(3, stu.getStuMajor());
			pstm.setInt(4, stu.getStuID());
			int count = pstm.executeUpdate();
			if(count > 0) {
				flag = true;
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
				if(con != null) con.close();
				if(pstm != null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public boolean delete_stu(int stuid) {
		boolean flag = false;
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			Class.forName(JAR);
			con = DriverManager.getConnection(URL, USER, PASSWD);
			String sql = "delete from stu_info where stuID=?";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, stuid);
			int count = pstm.executeUpdate();
			if(count > 0) {
				flag = true;
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
				if(con != null) con.close();
				if(pstm != null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
}
