<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
String name, passwd;
%>
<%
try{
	Cookie[] cookies = request.getCookies();
	for(Cookie co : cookies){
		if(co.getName().equals("name")){
			name = co.getValue();
		}
		if(co.getName().equals("password")){
			passwd = co.getValue();
		}
	}
}
catch(Exception e){
	out.println(e.getMessage());
}
%>
<form action="logincookie.jsp" method="get">
Name: <input type="text" name="uname" value="<%=(name==null?" ":name)%>"/><br/>
Password: <input type="password" name="upwd" value="<%=(passwd==null?" ":passwd)%>"/><br/>
<input type="submit" value="submit"/>
</form>
</body>
</html>