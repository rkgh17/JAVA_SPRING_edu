<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registger</title>
</head>
<body>
<form action="/create" >
Id : ${dto.userid}<br>
Password : ${dto.userpasscode}<br>
Name : ${dto.name}<br>
Mobile : ${dto.mobile}<br>
<br>
<input type=submit value="확인" >
</form>
</body>
</html>