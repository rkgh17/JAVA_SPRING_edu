<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 수정</title>
</head>
<body>
<form method=post action="/update">
<input type=hidden name=id id=id value='${post.id}'/>
<table align=center>
<tr><td align=right>제목</td><td><input type=text name=title id=title value='${post.title}'/></td></tr>
<tr><td align=right>내용</td><td><textarea id=content name=content rows=10 cols=40>${post.content}</textarea></td></tr>
<tr><td align=right>작성자</td><td><input type=text name=writer id=writer value='${post.writer}'/></td></tr>
<tr><td colspan=2 align=center>
	<input type=submit value='수정' name=btnSubmit id=btnSubmit>&nbsp;
	<input type=reset value='비우기'></td></tr>
</table>
</form>
<a href='/list'>목록보기</a>
</body>
</html>