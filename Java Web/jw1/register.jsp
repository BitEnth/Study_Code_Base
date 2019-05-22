<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="user" scope="page" class="jw1.UserBean">
<jsp:setProperty name="user" property="*"/>
</jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Two methods to get property:<br/><hr/>
1.UserBean->get:<br/>
<p>user's name:<%=user.getUserName() %></p>
<p>password:<%=user.getPassword() %></p>
<p>email:<%=user.getEmail() %></p>
<hr/>
<p>2.Use jsp:getProperty </p>
<p>user's name:<jsp:getProperty property="userName" name="user"/></p>
<p>password:<jsp:getProperty property="password" name="user"/></p>
<p>email:<jsp:getProperty property="email" name="user"/></p>
</body>
</html>