<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    


    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>체크박스(관광지 선택,JSP)</title>
</head>
<body>
	<h2>당신이 선택한 관광지입니다.(JSP)</h2>
	
	<c:forEach items="${places }" var="place" varStatus="i">
		${place }
	</c:forEach>


</body>
</html>