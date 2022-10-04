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
<form action="/create">
 아이디	: <input type = text name=loginid value="${dto.loginid}"><br>
 비밀번호 	: <input type = password name=loginpasscode value="${dto.loginpasscode}"><br>
&nbsp;
<input type=submit value='Login'>&nbsp;
<input type=reset value='비우기'><br><br>
<input type=button value='회원가입' onclick="location='signup'">
</form>
</body>
</html>