<%@ page language="java" contentType="text/html; charset=UTF-8" import = "java.util.Date"
session="true" buffer="8kb" autoFlush="true" info="One test page" isErrorPage="false"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- HTML Lable -->
<h1>Use page order</h1>
Now time is:
<%=new java.util.Date().toLocaleString() %>
<%--JSP Label --%>
</body>
</html>