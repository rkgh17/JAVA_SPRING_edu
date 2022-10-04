<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>viewSTD</title>
</head>
<body>
<table border=1>
<c:forEach var="person" items="${student}">
${person}
<tr>
	<td>${person.name }</td>
	
	<c:if test="${person.gender eq 'Female'}">
		<td><font color=red>${person.gender }</font></td>
	</c:if>
	
	<c:if test="${person.gender eq 'Male'}">
		<td><font color=blue>${person.gender }</font></td>
	</c:if>
	
	<td>${person.mobile }</td>
<tr>
<br><br>
</c:forEach>
</table>
</body>
</html>