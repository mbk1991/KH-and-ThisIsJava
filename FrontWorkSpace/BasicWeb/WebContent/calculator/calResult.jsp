<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%-- <% --%>
// 	int firstNum=Integer.parseInt(request.getParameter("num1"));
// 	int secondNum=Integer.parseInt(request.getParameter("num2"));
// 	char operator = request.getParameter("operator").charAt(0);
// 	int result = 0;
// 	switch(operator){
// 	case '+':
// 		result = firstNum + secondNum;
// 		break;
// 	case '-':
// 		result = firstNum - secondNum;
// 		break;
// 	case '*':
// 		result = firstNum * secondNum;
// 		break;
// 	case '/':
// 		result = firstNum / secondNum;
// 		break;
// 	}
<%-- %> --%>
<%
	int firstNum = (int)request.getAttribute("first");
	int secondNum = (int)request.getAttribute("second");
	char op = (char)request.getAttribute("operator");
	int result = (int)request.getAttribute("result");
	
%>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과보기</title>
</head>
<body>
	<h1>계산 결과는 다음과 같습니다.</h1>
	<%= firstNum %> <%=op %> <%=secondNum %>
	= <%=result %>

</body>
</html>