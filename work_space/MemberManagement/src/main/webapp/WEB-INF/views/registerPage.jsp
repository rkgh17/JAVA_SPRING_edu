<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registger</title>
</head>
<body>
Id : ${dto.userid}<br>
Password : ${dto.userpasscode}<br>
Name : ${dto.name}<br>
Mobile : ${dto.mobile}<br>
<input type="button" value="확인" onclick="location='loginForm'">
</body>
</html>