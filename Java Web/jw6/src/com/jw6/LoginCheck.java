package com.jw6;
import java.sql.*;
import com.jw6.LoginData;

public class LoginCheck {

	private final String JAR = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/test1";
	private final String user = "root";
	private final String passwd = "s1D5409pv";
	
	public int login(LoginData logindata) {
		int flag = -1;
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rst = null;
		try {
			Class.forName(JAR);
			con = DriverManager.getConnection(URL, user, passwd);
			String sql = "select count(*) from login where userName=? and userPwd=?";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, logindata.getUserName());
			pstm.setString(2, logindata.getUserPwd());
			rst = pstm.executeQuery();
			int count = 0;
			if(rst.next()) {
				count = rst.getInt(1);
				if(count == 0) {
					flag = 0;
				}else {
					flag = 1;
				}
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
				if(rst != null) rst.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
}
