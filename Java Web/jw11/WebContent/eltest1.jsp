<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jw11.data.StuData" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL EXPRESSION TEST PAGE</title>
</head>
<body>
	<!--${requestScope.stuinfo }<br/>
	${requestScope["my-address"] }<br/>
	${requestScope.hobbies[1] }<br/>
	${empty requestScope.nullValue}<br/>
	${requestScope.map[1] }<br/>-->
	${param.uname}<br/>
	${param.country}<br/>
	${paramValues.country[2]}<br/>
	${pageContext.request.localPort }
</body>
</html>