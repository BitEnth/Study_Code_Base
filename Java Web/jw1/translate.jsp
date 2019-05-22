<%@page import="java.io.UnsupportedEncodingException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
String translate(String chi){
	String result = null;
	byte temp[];
	try{
		temp = chi.getBytes("UTF-8");
		result = new String(temp);
	}
	catch(UnsupportedEncodingException e){
		System.out.println(e.toString());
	}
	return result;
}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String source = "欢迎, 初学朋友Fu*k U!";
out.println(translate(source));
%>
</body>
</html>