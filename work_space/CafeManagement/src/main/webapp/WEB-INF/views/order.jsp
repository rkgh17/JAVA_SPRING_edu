<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카페주문관리 - 주문관리</title>
</head>
<body>
<table style='width:100%;border:1px solid green;'>
	<tr><td style='width:33%;text-align:center;'><a href='/menu'><h3>메뉴관리</h3></a></td>
		<td style='width:33%;text-align:center;'><h3>주문관리</h3></td>
		<td style='width:33%;text-align:center;'><a href='/sales'><h3>실적관리</h3></a></td>
	</tr>
</table>
<table align=center style='border-collapse:collapse;border:1px solid blue;'>
<tr>
	<td style='border:1px solid blue;'><select id=selMenu size=20 style='width:200px'></select></td>
	<td style='border:1px solid blue;'><select id=selOrder size=20 style='width:200px'></select></td>
</tr>
<tr>
	<td style='vertical-align:top;border:1px solid blue;'>
		<table>
		<tr><td>메뉴</td><td><input type=text id=name readonly size=20></td></tr>
		<tr><td>수량</td><td><input type=number id=qty min=1 max=99>잔</td></tr>
		<tr><td>가격</td><td><input type=number id=price min=0 max=9999>원</td></tr>
		<tr><td colspan=2 align=center>
			<input type=button id=btnOrder value='주문'>&nbsp;
			<input type=button id=btnEmpty value='비우기'></td></tr>
		</table>
	</td>
	<td style='vertical-align:top;border:1px solid blue;'>
		<table>
		<tr><td>총금액</td><td><input type=text id=total readonly size=5>원</td></tr>
		<tr><td>모바일번호</td><td><input type=text id=mobile size=15></td></tr>
		<tr><td colspan=2>&nbsp;</td></tr>
		<tr><td colspan=2 align=center>
			<input type=button id=btnComplete value='주문완료'>&nbsp;
			<input type=button id=btnCancel value='주문 취소'></td></tr>
		</table>
	</td>
</tr>
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.ready(function(){
	getList();
})

.on('click','#selMenu option',function(){
	let optstr = $(this).text();
	let ar=optstr.split(',');
	//$('#id').val($.trim(ar[0]));
	$('#name').val($.trim(ar[1]));
	$('#price').val(ar[2]);
	$('#qty').val(1);
})
.on('change','#qty',function(){
	let price = parseInt($('#price').val());
	let qty =  parseInt($('#qty').val());
	//console.log(price);
	//console.log(qty);
	if(qty>=3){
		price = price/(qty-1);
	}
	qty = price * qty;
	//console.log(qty);
	$('#price').val(qty);
})
.on('click','#btnOrder',function(){
	let name = $('#name').val();
	let qty = $('#qty').val();
	let price = $('#price').val();
	let str = '<option>'+name+','+qty+','+price+'</option>';
	$('#selOrder').append(str);
	$('#name,#qty,#price').val('');
	
	
	
	/*$('#selOrder option').each(function(){
		let str=$(this).text();
		//console.log(str);
		let ar=str.split(',');
		//console.log(ar);
		//console.log(ar[2]);
		
		let total=0;
		
		for(let i=0 ; i<ar.length ; i++){

			//console.log(ar);
		}
		$('#total').val(total);
	});*/
	
})
.on('click','#btnEmpty',function(){
	$('#name,#qty,#price').val('');
	return false;
});









/*function qty(obj){
	let selectnum=$(obj).val();
	let optstr = $(this).text();
	let ar=optstr.split(',');
	$('#price').val();
}*/

function getList(){
	$.post('http://localhost:8081/loadMenu',{},function(rcv){
		$('#selMenu').empty();
		for(i=0; i<rcv.length ; i++){
			let str = '<option>'+rcv[i]['id']+','+rcv[i]['name']+','+rcv[i]['price']+'</option>';
			$('#selMenu').append(str);
		}
		//$('#name,#price').val('');
		//$('#btnEmpty').trigger('click');
	},'json');
}


</script>
</html>