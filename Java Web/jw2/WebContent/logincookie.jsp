<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	response.setCharacterEncoding("UTF-8");
	String name = " ";
	String passwd = " ";
	if(request.getParameter("uname") != null){
		name = request.getParameter("uname");
	};
	if(request.getParameter("upwd") != null){
		passwd = request.getParameter("upwd");
	}
	Cookie cookie1 = new Cookie("name", name);
	//password has some limitation, like no '\', ',' and so on.
	Cookie cookie2 = new Cookie("password", passwd);
	try{
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		cookie1.setMaxAge(10);
		cookie2.setMaxAge(10);
		response.sendRedirect("loginsuccess.html");
	}
	catch(Exception e){
		out.println(e.getMessage());
		out.println("<br/>");
		out.println(name+" & "+passwd);
	}
%>
</body>
</html>