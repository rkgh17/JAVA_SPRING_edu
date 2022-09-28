<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("------------------------------<br>");
	for (int i =2 ; i<10 ; i++){
		for (int j=1 ; j<10 ; j++){
			out.println(i+" * "+j+" = "+(i*j)+"<br>");
		}
		out.println("------------------------------<br>");
	}
%>
</body>
</html>