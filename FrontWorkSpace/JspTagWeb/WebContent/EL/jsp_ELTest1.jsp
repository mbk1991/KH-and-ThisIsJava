<%@page import="test.member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%
	 Member member
	=(Member) request.getAttribute("member");
%> --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL Test1</title>
</head>
<body>
<%-- 	아이디 : <%= member.getId()%> <br>
	비밀번호 : <%= member.getPassword()%> <br>
	이름 : <%= member.getName()%> <br> --%>
	EL버전<br>
	아이디 : ${member.id}<br>
	비밀번호 : ${member.password}<br>
	이름 : ${member.name}<br>
	
	<h1>MemberList 처리</h1>
	<h2>첫번째 데이터</h2>
	아이디 : ${mList[0].id}<br> 
	비밀번호 : ${mList[0].password }<br>
	이름 : ${mList[0].name }<br>
	
	
</body>
</html>