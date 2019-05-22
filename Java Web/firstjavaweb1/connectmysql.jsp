<%@ page contentType="text/html;charset=UTF-8" language="Java" import="java.sql.*, java.io.*"%>
<html>
	<body>
		<p align = "center">connect mysql<hr/>
		<%
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?useSSL=true","root","s1D5409pv");
				Statement stmt=con.createStatement();
				stmt.execute("show databases");
				stmt.close();
				con.close();
				out.println("connect successfully");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		%>
		</p>
	</body>
</html>