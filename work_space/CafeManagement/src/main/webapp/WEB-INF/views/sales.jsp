<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카페주문관리 - 실적관리</title>
</head>
<body>
<table style='width:100%;border:1px solid green;'>
	<tr><td style='width:33%;text-align:center;'><a href='/menu'><h3>메뉴관리</h3></a></td>
		<td style='width:33%;text-align:center;'><a href='/order'><h3>주문관리</h3></a></td>
		<td style='width:33%;text-align:center;'><h3>실적관리</h3></td> 
	</tr>
</table>
<table style='text-align:center;width:100%;'>
	<tr>
		<td><input type=date id=start>&nbsp;~&nbsp;<input type=date id=end>
			&nbsp;<input type=button id=btnFind value='찾기'>
		</td>
	</tr>
	<tr>
		<td style='vertical-align:top;'>
			<select id=selSales size=20 style='width:340px;'></select></td>
	</tr>
	<tr>
		<td>매출액 : <input type=number id=outgo>원</td>
	</tr>
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click','#btnFind',function(){
	$('#selSales').empty();
	let start = ($('#start').val()).replace(/-/g, "");
	//start.replace('-','');
	let end = ($('#end').val()).replace(/-/g, ""); //시작 끝 문자열 변환
	
	$.post('http://localhost:8081/getSalesList',{start:start,end:end},function(rcv){
		for(i=0; i<rcv.length ; i++){
			let str = '<option>'+rcv[i]['created']+' : '+rcv[i]['menu']+' , '+rcv[i]['qty']+'잔 , '+rcv[i]['price']+'원</option>';
			$('#selSales').append(str);
		}
	},'json');
	
	$.post('http://localhost:8081/getTotal',{start:start,end:end},function(rcv){
		$('#outgo').val(parseInt(rcv));
	},'text');
});
</script>
</html>