<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Attribute</title>
</head>
<body>
	<h1>Attribute Change test</h1>
	<%
		application.setAttribute("page", "p1");
		application.setAttribute("page", "p2");
		application.removeAttribute("page");
		
		request.setAttribute("combo", "blood-d");
		request.setAttribute("combo", "K4");
		request.removeAttribute("combo");
		
		session.setAttribute("user", "vv");
		session.setAttribute("user", "orio");
		session.removeAttribute("user");
	%>
</body>
</html>