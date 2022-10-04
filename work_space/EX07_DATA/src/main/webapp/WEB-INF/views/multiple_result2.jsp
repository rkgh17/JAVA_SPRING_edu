<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result_ver2</title>
</head>
<body>
<c:forEach var="a" items="${lists}">
	${a};
</c:forEach>
</body>
</html>