<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SESSION INVALIDATE</title>
</head>
<body>
	<%
		out.print("Session has been destroyed");
		session.invalidate();
	%>
</body>
</html>