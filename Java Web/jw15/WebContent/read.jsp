<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read session page</title>
</head>
<body>
	<h1>Read session from disk</h1><br/>
	ID:${sessionScope.JSAL.userID }<br/>
	Name:${sessionScope.JSAL.userName }
</body>
</html>