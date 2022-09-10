<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" herf="">
<title>Insert title here</title>
</head>
<body>
<div id="header">
		<div id="header-wrap">
			<div class="" id="logo"></div>
			<div class="" id="site-title">MySpringSite</div>
			<div class="" id="login-area">
				<form action="">
					<table border="1">
						<tr>
							<td>아이디</td>
							<td>
								<input type="text" name="memberId">
							</td>
						</tr>
						<tr>
							<td>비밀번호</td>
							<td>
								<input type="password" name="memberPwd">
							</td>
						</tr>
						<tr>
							<td><button>로그인</button></td>
							<td><button type="reset">취소</button></td>
						</tr>
						<tr>
							<td colspan="2">
								<a href="#">회원가입</a>
							</td>
						</tr>
					</table>
				</form>
			
			</div>
		</div>
		<div id="nav">
			<ul>
				<li class="menu" onclick="location.href='/home.kh';" >HOME</li>
				<li class="menu" onclick="" >공지사항</li>
				<li class="menu" onclick="" >자유게시판</li>
				<li class="menu" onclick="" >사진게시판</li>
			</ul>
		</div>
	</div>
	<div id="contents">
		<div id="join-wrap">
		<form action="#">
			<table>
				<tr>
					<td>아이디</td>
					<td>
						<input type="" value="" placeholder="" name="">
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td>
						<input type="" value="" placeholder="" name="">
					</td>
				</tr>
				<tr>
					<td>이름</td>
					<td>
						<input type="" value="" placeholder="" name="">
					</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td>
						<input type="" value="" placeholder="" name="">
					</td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td>
						<input type="" value="" placeholder="" name="">
					</td>
				</tr>
				<tr>
					<td>주소</td>
					<td>
						<input type="" value="" placeholder="" name="">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<button>가입</button>
						<button type="button">취소</button>
					</td>
				</tr>
			</table>
			</form>
		</div>
	</div>
	<div id="footer"></div>

</body>
</html>