package com.j;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

@SuppressWarnings("unused")
public class Callabletest1 {

	// save procedure and function
	// delimiter //
	// create procedure add2inums( in num1 int, in num2 int, out result int) begin select num1+num2 into result; end//
	
	private final String JAR = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/test1";
	private final String user = "root";
	private final String passwd = "s1D5409pv";
	
	public void invoke_add2inum() {
		try {
			Class.forName(JAR);
			Connection con = DriverManager.getConnection(URL, user, passwd);
			String sql = "{call add2inums(?,?,?)}";
			CallableStatement cstm = con.prepareCall(sql);
			cstm.setInt(1, 23);
			cstm.setInt(2, 54);
			cstm.setInt(3, 0);
			//cstm.registerOutParameter(3, Types.INTEGER);
			cstm.execute();
			int result = cstm.getInt(3);
			System.out.println(result);
			cstm.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callabletest1 ct1 = new Callabletest1();
		ct1.invoke_add2inum();
	}

}
