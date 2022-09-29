<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form method='get' action='/checkUser'>
로그인 아이디 : <input type=text name=loginid id=loginid><br>
비밀번호 : <input type=password name=passcode id=passcode><br>
<input type=submit value='전송' name=btnSubmit id=btnSubmit>
&nbsp;&nbsp;
<input type=reset value='비우기' name=btnReset id=btnReset>
</form>
</body>
</html>