<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp useBean</title>
</head>
<body>
<!--jsp빈 객체 생성 후 세터를 이용하는 모습.  -->
<!-- jsp액션태그를 이용해서 스크립트릿에 의존하지 않아도 된다. -->
	<jsp:useBean id="member" class="test.member.Member">
		<jsp:setProperty property="id" name="member" value="khuser01"/>
		<jsp:setProperty property="password" name="member" value="pass01"/>
		<jsp:setProperty property="name" name="member" value="일용자"/>
	</jsp:useBean>
	
	<h2>jsp:useBean</h2>
	ID : <jsp:getProperty property="id" name="member"/><br>
	PASSWORD :<jsp:getProperty property="password" name="member"/><br>
	NAME : <jsp:getProperty property="name" name="member"/><br>
</body>
</html>