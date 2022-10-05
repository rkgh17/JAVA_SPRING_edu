<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카페주문관리 - 메뉴관리</title>
</head>
<body>
<table>
<tr>
	<td>
		<select id=selMenu style='width:200px' size=20></select>
	</td>
	<td>
		<table>
		<tr><td align=right>메뉴명</td><td><input type=text id=name></td></tr>
		<tr><td align=right>가격</td><td><input type=number id=price>원</td></tr>
		<tr><td colspan=2 align=center>
			<input type=button id=btnAdd value='등록'>&nbsp;
			<input type=reset id=btnEmpty value='비우기'>&nbsp;
			<input type=button id=btnDelete value='삭제'></td></tr>
		</table>
	</td>
</tr>
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.ready(funtion(){
	$.post('/loadMenu',{},funtion(rcv){
		
	},'JSON');
	//AJAX
	// $.post(URL(RequestMapping),{서버에 보내는 입력},funtion(서버로부터 받은 출력){},'JSON'/'text'/'xml')
})
</script>
</html>