<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, com.jw7.unity.StuData" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Searching results page</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Student's ID</th>
			<th>Student's name</th>
			<th>Student's age</th>
			<th>Student's major</th>
		</tr>
		<%
		try{
			List<StuData> students = (List<StuData>)request.getAttribute("students");
			for(StuData stu : students){
				out.print("<tr>");
				out.print("<th>"+ stu.getStuID()+"</th>");
				out.print("<th>"+ stu.getStuName()+"</th>");
				out.print("<th>"+stu.getStuAge()+"</th>");
				out.print("<th>"+stu.getStuMajor()+"</th>");
				out.print("</tr>");
			}
		}catch(Exception e){
			out.print(e.getMessage());
		}
		%>
	</table>
</body>
</html>