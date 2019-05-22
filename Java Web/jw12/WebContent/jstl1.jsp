<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${requestScope.site }<br/>
	<c:out value="${requsetScope.site }" default="Null"/><br/>
	<c:set var="site" value="New York" scope="request"></c:set>
	${requestScope.site }<br/>
	${requestScope.student.stuName }<br/>
	<c:set target="${requestScope.student }" property="stuName" value="Bonus"/>
	${requestScope.student.stuName }<br/>
	<c:out value="<a href='https://www.baidu.com'>Baidu</a>" escapeXml="false"></c:out><br/>
	<c:set var="team" value="Ajax" scope="page"/>
	${team }<br/>
	<c:remove var="team" scope="page"/>
	<c:out value="${team }" default="Noteam"/>
</body>
</html>