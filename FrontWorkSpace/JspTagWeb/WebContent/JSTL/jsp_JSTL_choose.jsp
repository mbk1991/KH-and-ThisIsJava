<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Choose문</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.value2 == 1 }">
			1을 입력하셨습니다.<br>
		</c:when>
		<c:when test="${param.value2 == 2 }">
			2를 입력하셨습니다.<br>
		</c:when>
		<c:when test="${param.value2 == 3 }">
			3을 입력하셨습니다.<br>
		</c:when>
		<c:otherwise>
			1~3중에 입력해주세요.
		</c:otherwise>
	</c:choose>
</body>
</html>