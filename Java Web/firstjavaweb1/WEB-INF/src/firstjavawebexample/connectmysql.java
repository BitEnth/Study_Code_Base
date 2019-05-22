package firstjavawebexample;
import java.sql.*;

public class connectmysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "s1D5409pv");
	        Statement stmt = conn.createStatement();
	        stmt.execute("show databases;");
	        stmt.close();
	        conn.close();
	        System.out.println("Connect succeessfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		 
	}

}
