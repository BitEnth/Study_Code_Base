package com.jw4.dao;

import java.sql.*;

public class LoginDAO {
	
	private final String URL = "jdbc:mysql://localhost:3306/test1";
	private final String user = "root";
	private final String userpwd = "s1D5409pv";
	private final String sql1 = "select count(*) from login where userName=? and userPwd=?";
	
	public int login_check(String name, String password) {
		int count = -1;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, user, userpwd);
			PreparedStatement pstm = con.prepareStatement(sql1);
			pstm.setString(1, name);
			pstm.setString(2, password);
			ResultSet rst = pstm.executeQuery();
			if(rst.next()){
				count = rst.getInt(1);
			}
			rst.close();
			pstm.close();
			con.close();
			return count;
		}catch(Exception e){
			return -1;
		}
	}
}
