<%@ page language="java" contentType="text/html; charset=UTF-8" isErrorPage="true"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error deal page</title>
</head>
<body>
<%out.println("ERROR, F**k!!!"); %><br/>
<%=exception.getMessage() %>
</body>
</html>