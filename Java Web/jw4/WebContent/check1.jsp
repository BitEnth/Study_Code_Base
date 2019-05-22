<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jw4.dao.LoginDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check Page</title>
<%!
String name, passwd;
LoginDAO ld1 = new LoginDAO();
%>
</head>
<body>
<%
	name = request.getParameter("uname");
	passwd = request.getParameter("upwd");
	int result = ld1.login_check(name, passwd);
	if(result == 1){
		out.print("Sign in!");
	}else if(result == 0){
		out.print("Fail!");
	}else{
		out.print("System error!");
	}
%>
</body>
</html>