<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Multiple</title>
</head>
<body>
<form method='get' action='/multiple_result'>
Dan : <input type="number" name="dan" min="0" max="100" />
<input type=submit value='전송' name=btnSubmit id=btnSubmit>
&nbsp;&nbsp;
<input type=reset value='비우기' name=btnReset id=btnReset>
</form>
</body>
</html>