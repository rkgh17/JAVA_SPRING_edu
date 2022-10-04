<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp Form</title>
</head>
<body>
<form action="/register" method=post>
<font id="chkNotice" size="2"></font>
<table>
<tr><td allign=right>아이디</td><td> <input type = text name=loginid value="${loginid}" required><br>
<tr><td allign=right>비밀번호</td><td> <input type = password name=passcode value="${passcode}" id="passcode1" required><br>
<tr><td allign=right>비밀번호 확인</td><td> <input type = password name=passcode1 value="${passcode1}" id="passcode2"><br>
<tr><td allign=right>실명	</td><td><input type = text name=name value="${name}"><br>
<tr><td allign=right>모바일</td><td><input type = text name=mobile value="${mobile}"><br>
<tr><td colspan=2><input type=submit value='가입'>
<input type=button value='취소' onclick="location='login'"></td>
</table>
</form>
&nbsp;&nbsp;
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(function(){
    $('#passcode1').keyup(function(){
      $('#chkNotice').html('');
    });

    $('#passcode2').keyup(function(){

        if($('#passcode1').val() != $('#passcode2').val()){
          $('#chkNotice').html('비밀번호 일치하지 않음<br><br>');
          $('#chkNotice').attr('color', '#FF0000');
        } else{
          $('#chkNotice').html('비밀번호 일치함<br><br>');
          $('#chkNotice').attr('color', '#0000FF');
        }

    });
});
</script>
</html>