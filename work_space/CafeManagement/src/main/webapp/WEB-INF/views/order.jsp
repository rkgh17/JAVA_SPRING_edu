<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카페주문관리 - 주문관리</title>
</head>
<body>
<table width=100%>
	<tr><td width='33%'><a href='/menu'><h1>메뉴관리</h1></a></td>
		<td width='33%'><a href='/order'><h1>주문관리</h1></a></td>
		<td width='33%'><a href='/sales'><h1>실적관리</h1></a></td>
	</tr>
</table>
<table>
<tr>
	<td><select id=selMenu size=20 style='width:200px'></select></td>
	<td><select id=selOrder size=20 style='width:200px'></select></td>
</tr>
<tr>
	<td>
		<table>
		<tr><td>메뉴</td><td><input type=text id=name readonly></td></tr>
		<tr><td>수량</td><td><input type=number id=qty>잔</td></tr>
		<tr><td>가격</td><td><input type=number id=price>원</td></tr>
		<tr><td colspan=2 align=center>
			<input type=button id=btnOrder value='주문'>&nbsp;
			<input type=button id=btnEmpty value='비우기'></td></tr>
		</table>
	</td>
	<td>
	</td>
</tr>
</table>
</body>
</html>