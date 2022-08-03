<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.util.*"%>
<%@page import="library.model.vo.Book"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- <% --%>
<!-- // 	ArrayList<Book> bList = (ArrayList) request.getAttribute("bList"); -->
<%-- %>     --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 전체 조회</title>
</head>
<body>
<c:forEach items="${bList }" var="book">
	----------<br>
	책번호: ${book.bookNo }<br>
	책이름: ${book.bookName }<br>
	작가: ${book.writer }<br>
	가격: ${book.price }<br>
	출판사: ${book.publisher }<br>
	장르: ${book.genre }<br>
	----------<br>
</c:forEach>


<%-- 	<% --%>
<!-- // 		for(Book book: bList){ -->
<!-- // 			int bookNo = book.getBookNo(); -->
<!-- // 			String bookName = book.getBookName(); -->
<!-- // 			String writer = book.getWriter(); -->
<!-- // 			int price = book.getPrice(); -->
<!-- // 			String publisher = book.getPublisher(); -->
<!-- // 			String genre = book.getGenre(); -->
<%-- 	%> --%>
<!-- 		-----------------------------<br> -->
<%-- 		책번호 : <%=bookNo %><br> --%>
<%-- 		책이름 : <%=bookName %><br> --%>
<%-- 		작가 :  <%=writer %><br> --%>
<%-- 		가격 :  <%=price %><br> --%>
<%-- 		출판사 :  <%=publisher %><br> --%>
<%-- 		장르 : <%=genre %><br> --%>
<!-- 		-----------------------------	 -->
	
<%-- 	<% --%>
<!-- // 		} -->
<%-- 	%> --%>



</body>
</html>