<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Send Cookies</title>
</head>
<body>
<%
	Cookie cookie1 = new Cookie("name", "Julia");
	Cookie cookie2 = new Cookie("password", "90ad3wq7:js]");
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	response.sendRedirect("showcookies.jsp");
%>
</body>
</html>