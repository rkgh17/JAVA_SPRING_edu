<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 보기</title>
</head>
<body>
<table align=center border=1>
<tr><td align=right>작성일자</td><td>${post.created}</td></tr>
<tr><td align=right>제목</td><td>${post.title}</td></tr>
<tr><td align=right>내용</td><td>${post.content}</textarea></td></tr>
<tr><td align=right>작성자</td><td>${post.writer}</td></tr>
<tr><td colspan=2 align=center>
	<input type=button value='수정' name=btnUpdate id=btnUpdate onclick="document.location='/updateForm/${post.id}';">&nbsp;
	<input type=reset value='삭제' name=btnDelete id=btnDelete onclick="document.location='/delete/${post.id}';"></td></tr>
</table>
<a href='/list'>목록보기</a>
</body>
</html>