<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String gender = request.getParameter("gender");
	String checkEmail = request.getParameter("check_mail");
%>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= gender %> <br> <%=checkEmail%>
</body>
</html>