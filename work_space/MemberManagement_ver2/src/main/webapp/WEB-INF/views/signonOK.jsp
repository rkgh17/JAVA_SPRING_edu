<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registger</title>
</head>
<body>
<form action="/login" method=post>
Id : ${loginid}<br>
Password : ${passcode}<br>
Name : ${name}<br>
Mobile : ${mobile}<br>
<br>
<input type=submit value="확인" >
</form>
</body>
</html>