<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jw8.service.*, com.jw8.DButil.Studata, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students Page</title>
<script type="text/javascript" src="pagecheck.js"></script>
<%!
	PageService ps = new PageService();
%>
</head>
<body onload="pagecheck(<%=ps.getCurrentPage() %>, 1, 3)">
	<table>
		<tr>
			<th>Student's ID</th>
			<th>Student's Name</th>
			<th>Student's Age</th>
			<th>Student's Major</th>
		</tr>
		<tr>
			<%
				ps = (PageService)request.getAttribute("pageinfo");
				StuService ss = new StuService();
				//List<Studata> stus = ss.QueryStuByPage(1, 3);
				List<Studata> stus = ps.getStudents();
				for(Studata stu : stus){
					out.print("<tr>");
					out.print("<th>"+ stu.getStuID()+"</th>");
					out.print("<th>"+ stu.getStuName()+"</th>");
					out.print("<th>"+stu.getStuAge()+"</th>");
					out.print("<th>"+stu.getStuMajor()+"</th>");
					out.print("</tr>");
				}
			%>
		</tr>
	</table>
	<h3>Current Page: <%=ps.getCurrentPage() %></h3>
	<a href="QueryByPageServe?pageno=1">First Page</a>
	<input type="button" value="previous page" id="pp" onclick="window.location.href='QueryByPageServe?pageno=<%=(ps.getCurrentPage()-1) %>'"/>
	<input type="button" value="next page" id="np" onclick="window.location.href='QueryByPageServe?pageno=<%=(ps.getCurrentPage()+1) %>'"/>
	<a href="QueryByPageServe?pageno=<%=ps.getTotalPageNum() %>">Last Page</a>
</body>
</html>