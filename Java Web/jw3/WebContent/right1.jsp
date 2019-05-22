<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
<%
	String name = session.getAttribute("username").toString();
	if(name != null){
		out.print("Welcome, f**k shit "+name);
		Cookie cookie1 = new Cookie("uname", name);
		response.addCookie(cookie1);
		System.out.println("seesionID: "+session.getId());
	}else{
		response.sendRedirect("login1.html");
	}
%>
<br/>
<input type="button" value="validate" onclick="javascript:location.href='validate1.jsp'"/>
</body>
</html>