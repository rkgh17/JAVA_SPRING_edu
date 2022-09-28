<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과일 출력하기</title>
</head>
<body>
<c:forEach var="fruit" items="${lists}">
	${fruit}<br>
</c:forEach>
<br>
fruit:${names}<br>

</body>
</html>