<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <% --%>
// 	String[] places = request.getParameterValues("place");
<%-- %> --%>
<%
	String[] places = (String[])request.getAttribute("places");
%>


    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>체크박스(관광지 선택,JSP)</title>
</head>
<body>
	<h2>당신이 선택한 관광지입니다.(JSP)</h2>
	<% for(String place:places){ %>
			<%=place%>,		
	<% }
		%>
</body>
</html>