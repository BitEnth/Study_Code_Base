<%@ page language="java" contentType="text/html; charset=UTF-8" import="javax.servlet.http.Cookie, java.util.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String userName="Smith";
Cookie cookie[]=request.getCookies();
response = null;
List<Cookie> list=Arrays.asList(cookie);
Iterator<Cookie> it=list.iterator();
while(it.hasNext()){
	Cookie temp = it.next();
	if(temp.getName().equals(userName+"login time")){
		response.addCookie(temp);
		break;
	}
}
out.print("Local time: "+new java.util.Date()+"<br>");
if(response != null){
	out.print("Last time: "+response.getStatus());
}
%>
</body>
</html>