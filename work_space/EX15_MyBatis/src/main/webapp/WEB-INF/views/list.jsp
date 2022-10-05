<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
<table border=1>
<c:forEach var="worker" items="${list}">
<tr>
	<td>${worker.employee_id }</td>
	<td>${worker.emp_name}</td>
	<td>${worker.manager_id}</td>
</tr>
</c:forEach>
</table>
</body>
</html>