<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--JSP Expression Language --%>
<h1>${member.name}님 회원가입이 되셨습니다.</h1>
<hr/>
<h2>회원정보</h2>
<ul>
	<li>아이디&nbsp;:${member.id}
	<li>비밀번호:${member.password}
	<li>이름&nbsp;&nbsp;:${member.name}
	<li>성별&nbsp;&nbsp;:${member.gender}
	<li>이메일&nbsp;:${member.email}	
</ul>
<h4><a href="/MVC/index.jsp" >메인으로 이동</a></h4>
</body>
</html>