<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>회원가입</title>
</head>
<style>
div.ex{
	text-align:center;
	width:50%;
	padding:10px;
	border: 5px solid grey;
	magin:20px;
}
</style>

<body>
<h1>&nbsp;&nbsp;회원가입</h1>
	<div class="ex">
		<form action="/MVC/doRegister" method="post">
			<table cellpadding="5px">
			<tr><h3>Fill out the Information</h3></tr>
				<tr>
					<td>아이디:</td>
					<td><input type="text" name="id"/></td>
				</tr>
				<tr>
					<td>비밀번호:</td>
					<td><input type="password" name="password"/></td>
				</tr>
				<tr>
					<td>이름:</td>
					<td><input type="text" name="name"/></td>
				</tr>
				<tr>
					<td>성별:</td>
					<td>
					<input type="radio" name="gender" checked="checked" value="male"/>남
					<input type="radio" name="gender" value="female"/>여
					</td>
				</tr>
				<tr>
					<td>이메일:</td>
					<td><input type="email" name="email" placeholder="id@host"></td>
				</tr>
				<tr>
				<td></td>
					<td><input type="submit" value="확인"/></td>
				</tr>
			</table> 
		</form>
	</div> 
</body>
</html>