<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.jw15.JSAListener1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write session page</title>
</head>
<body>
	<h1>Write Session</h1><br/>
	<%
		JSAListener1 jsal = new JSAListener1();
		jsal.setUserID(31920156);
		jsal.setUserName("Kawn");
		session.setAttribute("JSAL", jsal);
	%>
	<input type="button" value="read" onclick="window.location.href='read.jsp'"/>
</body>
</html>