<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>If문</title>
</head>
<body>
<%-- 	<c:if test="${member.id=='khuser01' }"> --%>
<!-- 		일용자님 반갑습니다. -->
<%-- 	</c:if> --%>
<%-- 	<c:if test="${number%2==0 }"> --%>
<!-- 		짝수입니다. -->
<%-- 	</c:if> --%>
	<c:if test="${param.value1 % 2 == 0 }">
		짝수입니다<br>
	</c:if>
	<c:if test="${param.value1 % 2 != 0 }">
		홀수입니다<br>
	</c:if>

</body>
</html>