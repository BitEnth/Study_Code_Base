<%@ page language="java" contentType="text/html; charset=UTF-8" errorPage="errordeal.jsp"
    pageEncoding="UTF-8"%>
<%! int i = 0;
	int j = 1;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Must be error</title>
</head>
<body>
<%
out.println(j/i);
%>
</body>
</html>