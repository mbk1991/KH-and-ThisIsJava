<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 보기</title>
</head>
<body>
	<h2>개인 취향 테스트 결과 화면</h2>
	
	이름은 ${name } 이며 좋아하는 색깔은
	<c:choose >
		<c:when test="${color == 'red'}"> 빨간색 </c:when>
		<c:when test="${color == 'blue'}"> 파란색 </c:when>
		<c:when test="${color == 'yellow'}"> 노란색 </c:when>
		<c:when test="${color == 'green'}"> 초록색 </c:when>
	</c:choose>
	입니다.<br> 좋아하는 동물은
	<c:choose>
		<c:when test="${pet == 'dog' }"> 개 </c:when>
		<c:when test="${pet == 'cat' }"> 고양이 </c:when>
		<c:when test="${pet == 'bird' }"> 새 </c:when>
		<c:when test="${pet == 'fish' }"> 물고기 </c:when>
	</c:choose>
 	입니다.<br> 좋아하는 음식은
 	
 	<c:forEach items="${foods }" var="food" varStatus="i">
 		<c:choose>
 			<c:when test ="${food=='zzazang' }">짜장면</c:when>
 			<c:when test ="${food=='zzambbong' }">짬뽕</c:when>
 			<c:when test ="${food=='tang' }">탕수육</c:when>
 			<c:when test="${food=='pal' }">팔보채</c:when>
 			<c:otherwise></c:otherwise>
 		</c:choose>
 	</c:forEach> 입니다.
	

	
	
</body>
</html>