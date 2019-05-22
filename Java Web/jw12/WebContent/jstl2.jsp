<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%! String[] teamSoccer = new String[]{"Livepool", "Hotspur", "Ajax", "Java"}; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL2</title>
</head>
<body>
	<c:if test="${1 eq 1 }" var="result" scope="page">
		${result }<br/>
		<h3>Yes JSTL</h3>
	</c:if>
	<c:set var="team" value="PSG.LGD" scope="page"></c:set>
	<c:choose>
		<c:when test="${team == 'OG' }">
			<h4>Championship</h4>
		</c:when>
		<c:when test="${team == 'PSG.LGD' }">
			<h4>CNDOTA YES</h4>
		</c:when>
		<c:when test="${team == 'EG' }">
			<h4>Sh*t of all</h4>
		</c:when>
		<c:otherwise>
			<h4>Not a nigga</h4>
		</c:otherwise>
	</c:choose>
	<c:forEach begin="0" end="3" step="1" varStatus="status">
		<h3>${requestScope.teamsoccer[status.index]}</h3>
	</c:forEach>
	<c:forEach var="t" items="${requestScope.teamsoccer}">
		<h3>${t}</h3>
	</c:forEach>
</body>
</html>