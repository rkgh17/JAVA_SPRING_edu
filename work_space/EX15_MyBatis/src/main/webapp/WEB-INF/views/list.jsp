<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
</head>
<body>
<table border=1>
<c:forEach var="post" items="${list}">
<tr>
	<td>${post.id }</td>
	<td>${post.created}</td>
	<td><a href='/view/${post.id}'>${post.title}</a></td>
	<td>${post.writer}</td>
</tr>
</c:forEach>
</table>
<input type=button name=btnAddNew id=btnAddNew onclick="document.location='/insertForm';" value='새글쓰기'/>
</body>
</html>