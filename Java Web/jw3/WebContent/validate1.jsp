<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validate Page</title>
</head>
<body>
<%
Cookie[] cookies = request.getCookies();
for(Cookie cookie : cookies){
	if(cookie.getName().equals("JSESSIONID")){
		System.out.println("JSESSIONID: "+cookie.getValue());
	}
}
session.invalidate();
out.println("session has been deleted.");
//session.removeAttribute("username");
//String uname = session.getAttribute("username").toString();
//out.print(uname);
%>
<br/>
<input type="button" value="Back" onclick="javascript:location.href='login1.html'"/>
</body>
</html>