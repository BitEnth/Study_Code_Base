package com.mysql.connector;
import java.sql.*;

public class ConnectorJ {

	private final String JAR = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/test1";
	private final String user = "root";
	private final String passwd = "s1D5409pv";
	private final String sql1 = "insert into stu_info values ('20191011', 'JessyCandy', '24', 'Painting Art')";
	private final String sql2 = "update stu_info set stuAge=27 where stuID=20190954";
	private final String sql3 = "insert into stu_info values ('20190956', 'MarryCandy', '26', 'Advertisement')";
	private final String sql4 = "delete from stu_info where stuID=20190954";
	private final String sql5 = "select stuID, stuName from stu_info";
	private String sql6 = "select stuID, stuName, stuMajor from stu_info where stuName like";
	
	public void update() {
		try {
			Class.forName(JAR);
			Connection con1 = DriverManager.getConnection(URL, user, passwd);
			Statement stm1 = con1.createStatement();
			stm1.executeUpdate(sql1);
			//stm1.executeUpdate(sql2);
			stm1.executeUpdate(sql3);
			//stm1.executeUpdate(sql4);
			stm1.close();
			con1.close();
			System.out.println("Operate successfully!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void query() {
		try {
			Class.forName(JAR);
			Connection con1 = DriverManager.getConnection(URL, user, passwd);
			Statement stm1 = con1.createStatement();
			String fname = " '%Candy' ";
			sql6 = sql6.concat(fname);
			ResultSet rst = stm1.executeQuery(sql6);
			while(rst.next()) {
				System.out.println(rst.getInt("stuID")+"---"+rst.getString("stuName")+"---"+rst.getString("stuMajor"));
			}
			rst.close();
			stm1.close();
			con1.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update_prepare() {
		try {
			Class.forName(JAR);
			Connection con = DriverManager.getConnection(URL, user, passwd);
			String sqlp = "insert into stu_info values (?, ?, ?, ?)";
			PreparedStatement pstm = con.prepareStatement(sqlp);
			pstm.setInt(1, 20191110);
			pstm.setString(2, "MarkTwin");
			pstm.setInt(3, 41);
			pstm.setString(4, "Literature");
			pstm.execute();
			pstm.close();
			con.close();
			System.out.println("Operate Successfully!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void query_prepare() {
		try {
			Class.forName(JAR);
			Connection con  = DriverManager.getConnection(URL, user, passwd);
			String sqlp = "select stuID, stuName from stu_info where stuName like ?";
			PreparedStatement pstm = con.prepareStatement(sqlp);
			pstm.setString(1, "%Candy");
			ResultSet rst = pstm.executeQuery();
			while(rst.next()) {
				System.out.println(rst.getInt(1)+"---"+rst.getString(2));
			}
			rst.close();
			pstm.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectorJ cj1 = new ConnectorJ();
		//cj1.update();
		//cj1.query();
		//cj1.update_prepare();
		cj1.query_prepare();
	}

}
