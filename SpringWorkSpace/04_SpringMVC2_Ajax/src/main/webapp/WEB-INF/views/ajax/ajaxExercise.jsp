<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax 알아보기</title>
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
	<h1>Ajax 개요</h1>
	<p>Ajax는 Asynchronous Javascript And XML이란 용어로<br>
	서버로부터 데이터를 가져와 전체 페이지를 새로 고치지 않고 일부만 로드할 수 있게 하는 기법<br>
	비동기식 요청을 함.</p>
	<h3>동기식/비동기식이란?</h3>
	<p>동기식은 서버와 클라이언트가 동시에 통신하여 프로세스를 수행 및 종료까지 같이하는 방식<br>
	이에 반해 비동기식은 페이지 리로딩없이 서버요청 사이사이 추가적인 요청과 처리 가능</p>

	<h3>Ajax 구현(Javascript)</h3>
	<h4>1. ajax로 서버에 전송값 보내기</h4>
	<p>버튼 클릭시 전송값을 서버에서 출력</p>
	<input type="text" id="msg-1">
	<button onclick="jsFunc();">보내기(JS)</button>
	
	
	<h3>Ajax 구현(jQuery)</h3>
	<h4>2. ajax(jQuery)로 서버에 전송값 보내기</h4>
	<p>버튼 클릭시 전송값을 서버에서 출력</p>
	<input type="text" id="msg-2">
	<button onclick="jqueryFunc();">보내기(jQuery)</button>
	
	
	<h3>3. 버튼 클릭시 서버에서 보낸 값 수신</h3>
	<button id="jq-btn3">서버에서 보낸값 확인</button>
	<p id="confirm-area"></p>
		
	

	<script>
////jQuery방식
		$("#jq-btn3").on("click",function(){
			$.ajax({
				url : "/ajax/ex2.kh",
				type : "GET",
				success : function(data){
					$("#confirm-area").html(data);
				},
				error : function(){
					console.log("처리 실패");
				}
			});
		});



		function jqueryFunc(){
			var message = $("#msg-2").val();
			$.ajax({
				url : "/ajax/ex1.kh",
				data : {"msg" : message},
				type : "get",
				success : function(){
					console.log("서버 전송 성공");
				},
				error : function(){
					console.log("서버 전송 실패");
				}
			});
	}
	
	
	
////바닐라js방식
		function jsFunc(){
			//1.XMLHttpRequest 객체 생성
			var xhttp = new XMLHttpRequest();
			var msg = document.querySelector("#msg-1").value;
			//2.요청정보 설정
			xhttp.open("GET","/ajax/ex1.kh?msg="+msg,true);
			//3.데이터처리에 따른 동작함수 설정
			xhttp.onreadystatechange=function(){
				if(this.readyState = 4 && this.status == 200){
					//status -> 200(요청성공),404(페이지,url없음),500(서버오류발생),403(접근거부),400(쿼리스트링 갯수오류)
					console.log("서버 전송 성공")
					var responseJson = JSON.parse(xhttp.response);
					console.log(responseJson.msg);
				}else if(this.readState == 4 && this.status == 404){
					console.log("서버 전송 실패")
				}
			}
			//4.전송
			xhttp.send();
		}
	</script>
</body>
</html>