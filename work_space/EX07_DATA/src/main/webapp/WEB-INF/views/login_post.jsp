<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form id=frmLogin method='post' action='/checkUser_post'>
로그인 아이디 : <input type=text name=loginid id=loginid><br>
비밀번호 : <input type=password name=passcode id=passcode><br>
<input type=submit value='전송' name=btnSubmit id=btnSubmit>
<!-- <input type=button value='전송' name=btnSubmit id=btnSubmit> -->
&nbsp;&nbsp;
<input type=reset value='비우기' name=btnReset id=btnReset>
</form>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('click','#btnSubmit',function(){
	if( $('#loginid').val()!='' && $('#passcode').val()!=''){
		let url='/checkUser?loginid='+$('#loginid').val()+'&passcode='+$('#passcode').val();
		document.location=url;
	}else{
		alert('아이디 또는 비밀번호가 입력되지 않았습니다.');
		return false;
	}
})
</script>
</html>