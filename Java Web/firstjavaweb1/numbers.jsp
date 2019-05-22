<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page info="A test"%>
<html>
	<head>
		<title>JSP Principle</title>
	</head>
	<body>
		<center>
		<h1>
			<%
			int times = Integer.parseInt(request.getParameter("times"));
			for(int i = 0;i < times;i++)
			{
				out.println("hello, world!");
				out.println("<br>");
			}
			%>
		</h1>
		</center>
	</body>
</html>
