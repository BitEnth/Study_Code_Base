<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check Page</title>
</head>
<body>
<%
	String name, passwd;
	name = request.getParameter("uname");
	passwd = request.getParameter("upwd");
	if(name.equals("admin") && passwd.equals("jntm")){
		session.setAttribute("username", name);
		session.setAttribute("userpasswd", passwd);
		session.setMaxInactiveInterval(10);
		request.getRequestDispatcher("right1.jsp").forward(request, response);
	}else{
		response.sendRedirect("fail1.html");
	}
%>
</body>
</html>