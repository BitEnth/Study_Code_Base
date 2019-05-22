<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" url="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Tag library</title>
</head>
<body>
<% session.setAttribute("Name", "Smith"); %>
<h4>Name:</h4>
<c:if test = "${sessionScope.Name == 'Smith'}">
${sessionScope.Name}<br>
</c:if>
</body>
</html>