<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
받은 값 : ${dan}<br>
<%
	int dan=Integer.parseInt(request.getParameter("dan"));
	out.println("------------------------------<br>");
	
	for (int i = dan ; i<10; i++){
		for (int j=1 ; j<10 ; j++){
			out.println(i+" * "+j+" = "+(i*j)+"<br>");
		}
		out.println("------------------------------<br>");
	}
	
%>
</body>
</html>