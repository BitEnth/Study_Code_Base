package com.mysql.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Connectest1 {
	
	private final String JAR = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/test1";
	private final String user = "root";
	private final String passwd = "s1D5409pv";
	
	public void query_s() {
		try {
			Class.forName(JAR);
			Connection con = DriverManager.getConnection(URL, user, passwd);
			Statement stm = con.createStatement();
			Scanner scan = new Scanner(System.in);
			System.out.println("Input the name of user: ");
			String name = scan.nextLine();
			System.out.println("Input password: ");
			String passwd = scan.nextLine();
			String sqls = "select count(*) from login where userName='"+name+"' and userPwd='"+passwd+"'";
			ResultSet rst = stm.executeQuery(sqls);
			int result = -1;
			if(rst.next()) {
				result = rst.getInt(1);
			}
			if(result == 1) {
				System.out.println("Sign in successfully");
			}else {
				System.out.println("Fail to sign in");
			}
			rst.close();
			stm.close();
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

	public static void main(String args[]) {
		// TODO Auto-generated method stub
			Connectest1 ct1 = new Connectest1();
			ct1.query_s();
	}

}
