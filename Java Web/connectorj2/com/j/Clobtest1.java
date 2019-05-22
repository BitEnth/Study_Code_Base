package com.j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Clobtest1 {

	private final String JAR = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/test1";
	private final String user = "root";
	private final String passwd = "s1D5409pv";
	
	public void clobsave() {
		try {
			Class.forName(JAR);
			Connection con = DriverManager.getConnection(URL, user, passwd);
			String sql = "insert into novels values (?, ?, ?)";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, 1916261);
			pstm.setString(2, "Yellow1");
			File file = new File("/home/murphy/yellow1.txt");
			InputStream inp = new FileInputStream(file);
			Reader reader = new InputStreamReader(inp, "UTF-8"); // UTF-8mb4
			pstm.setCharacterStream(3, reader, file.length());
			int flag = pstm.executeUpdate();
			if(flag == 0) {
				System.out.println("Fail!");
			}else {
				System.out.println("Success, "+flag);
			}
			reader.close();
			inp.close();
			pstm.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("can't find this file");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			System.out.println("text encoding is wrong");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clobread() {
		try {
			Class.forName(JAR);
			Connection con = DriverManager.getConnection(URL, user, passwd);
			String sql = "select novelContent from novels where novelID=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, 1916261);
			ResultSet rst = pstm.executeQuery();
			if(rst.next()) {
				Reader reader = rst.getCharacterStream("novelContent");
				Writer writer = new FileWriter("/home/murphy/Desktop/yellowf.txt");
				char[] c = new char[1024];
				int len = 0;
				while((len = reader.read(c)) != -1) {
					writer.write(c, 0, len);
				}
				reader.close();
				writer.close();
			}
			pstm.close();
			con.close();
			System.out.println("read successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("can't find this file");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			System.out.println("text encoding is wrong");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clobtest1 ct1 = new Clobtest1();
		//ct1.clobsave();
		ct1.clobread();
	}

}
