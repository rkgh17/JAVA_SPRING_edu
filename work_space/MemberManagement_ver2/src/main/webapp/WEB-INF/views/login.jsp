<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>
<table>
<form action="/doLogin" method=post>
<tr><td allign=right>아이디</td><td><input type = text name=loginid value="${loginid}">
<tr><td allign=right>비밀번호</td><td><input type = password name=passcode value="${passcode}">
<tr><td colspan=3>
<input type=submit value='로그인'>
<input type=reset value='비우기'>
<input type=button value='회원가입' onclick="location='signon'">
</td>
&nbsp;
</form>
</table>
</body>
</html>