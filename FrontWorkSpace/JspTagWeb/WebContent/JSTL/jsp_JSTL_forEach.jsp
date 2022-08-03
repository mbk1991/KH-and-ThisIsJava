<%@page import="java.util.ArrayList"%>
<%@page import="test.member.Member"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forEach문</title>
</head>
<body>
<!--items는 리스트 데이터를 받음, var는 리스트 중 한 개를 받음
varStatus는 index값과 관련이 있음  -->
<!-- 	테스트를 위한스크립트릿 -->
	<%
// 		ArrayList<Member> mList = Arrays.asList(
// 				new Member("khuser01","pass01","일용자"),
// 				new Member("khuser02","pass02","이용자"),
// 				new Member("khuser03","pass03","삼용자")
// 				);
	
		ArrayList<Member> mList = new ArrayList<>();
		mList.add(new Member("khuser01","pass01","일용자"));
		mList.add(new Member("khuser02","pass02","이용자"));
		mList.add(new Member("khuser03","pass03","삼용자"));
		request.setAttribute("mList",mList);
	%>


	<c:forEach items="${mList }" var="member" varStatus="i" >
		${member.id },${member.password },${member.name }<br>
	</c:forEach>
	
</body>
</html>