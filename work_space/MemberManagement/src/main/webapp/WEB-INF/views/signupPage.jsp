<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp Form</title>
</head>
<body>
<form action="/register">
   아이디	 	: <input type = text name=writer value="${dto.userid}"><br>
  비밀번호 	: <input type = password name=content value="${dto.userpasscode}"><br>
 비밀번호 확인	: <input type = password name=content value="${dto.userpasscode2}"><br>
    실명		: <input type = text name=writer value="${dto.name}"><br>
   모바일		: <input type = text name=writer value="${dto.mobile}"><br>
&nbsp;
<input type=submit value='가입'>&nbsp;
<input type=reset value='취소' onclick="location='createPage'"><br>
</form>
</body>
</html>