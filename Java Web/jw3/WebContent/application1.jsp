<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application</title>
</head>
<body>
<%
String cpath = application.getContextPath();
out.print("context path: " + cpath + "<br/>");
String rpath = application.getRealPath(cpath);
out.print("real path: " + rpath);
%>
</body>
</html>