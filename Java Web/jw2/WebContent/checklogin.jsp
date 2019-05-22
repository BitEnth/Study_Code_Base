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
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("uname");
String passwd = request.getParameter("upw");
if(name.equals("dd") && passwd.equals("123")){
	//response.sendRedirect("successlogin.jsp");
	request.getRequestDispatcher("successlogin.jsp").forward(request, response);
}else{
	out.println("Fail to log in!");
	out.println(name);
	out.println(passwd);
}
%>
</body>
</html>