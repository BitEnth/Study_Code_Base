<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.jw15.JSBListener1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Binding</title>
</head>
<body>
	<%
		JSBListener1 jsbl = new JSBListener1();
		session.setAttribute("sessionbean", jsbl);
	%>
</body>
</html>