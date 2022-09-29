<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
<form id=frmGugu method='get' action='/showDan'>
Dan : <input type=text name=dan id=dan><br>
<input type=submit value='구구단 보여주기'>
&nbsp;
<input type=reset value='비우기'>
</form>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
<%-- 
 
$(document).on('clikc','#btnSubmit',function(){
	if(){
		$('#frmGugu').submit();
	}else{
		return false;
	}

})
 
--%>

$(document).on('submit','#frmGugu',function(){
	document.location='/showDan/'+$('#dan').val();
	return false;
})
</script>
</html>