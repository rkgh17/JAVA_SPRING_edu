<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>
${error_message}
<table>
<form action="/create">
<tr><td allign=right>아이디</td><td><input type = text name=loginid value="${dto.loginid}">
<tr><td allign=right>비밀번호</td><td><input type = password name=loginpasscode value="${dto.loginpasscode}">
<tr><td colspan=3>
<input type=submit value='로그인'>
<input type=reset value='비우기'>
<input type=button value='회원가입' onclick="location='signup'">
</td>
&nbsp;
</form>
</table>
</body>
</html>