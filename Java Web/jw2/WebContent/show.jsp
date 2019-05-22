<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Successfully</title>
</head>
<body>
<p>Your Information:</p>
<%
String name = request.getParameter("uname");
int age = Integer.parseInt(request.getParameter("uage"));
String passwd = request.getParameter("upwd");
String[] hobbies = request.getParameterValues("uhobby");
%>
Name: <%=name %><br/>
Age: <%=age %><br/>
Password: <%=passwd %><br/>
Hobbies:
<%
if(hobbies != null){
	for(String hobby : hobbies){
		out.print(hobby + " ");
	}
}
%>
</body>
</html>