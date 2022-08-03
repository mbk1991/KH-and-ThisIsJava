<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core Tags 실습</title>
</head>
<body>
	<h2>JSTL Core Tags1 실습</h2>
	<!--스크립트릿을 써서 제어문을 사용하면 불편~  -->
	<c:set var="num1" value="100"></c:set>
	<c:set var="num2" value="200"></c:set>
	<ol>
		<li><c:out value="${num1 }"></c:out></li>
		<li><c:out value="${num2 }"></c:out></li>
	</ol>	
	<h2>JSTL Core Tag2 실습(scope)</h2>
	<c:set var="number" value="300" scope="request"></c:set>
		
</body>
</html>