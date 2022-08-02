<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.util.*"%>
<%@page import="library.model.vo.Book"%>


<%
	ArrayList<Book> bList = (ArrayList) request.getAttribute("bList");
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 전체 조회</title>
</head>
<body>
	<%
		for(Book book: bList){
			int bookNo = book.getBookNo();
			String bookName = book.getBookName();
			String writer = book.getWriter();
			int price = book.getPrice();
			String publisher = book.getPublisher();
			String genre = book.getGenre();
	%>
		-----------------------------<br>
		책번호 : <%=bookNo %><br>
		책이름 : <%=bookName %><br>
		작가 :  <%=writer %><br>
		가격 :  <%=price %><br>
		출판사 :  <%=publisher %><br>
		장르 : <%=genre %><br>
		-----------------------------	
	
	<%
		}
	%>



</body>
</html>