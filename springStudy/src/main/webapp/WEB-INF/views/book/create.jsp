<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<html>
 <head>
	<link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" type="text/css">
	<title>책 생성하기</title>
</head>
<body>
	<div class="APP">
		<div>
			<h1>책 생성하기</h1>
			<form method="POST" class="form">
			   <p>제목 : <input type="text" name="title" /></p>
			   <p>카테고리 : <input type="text" name="category" /></p>
			   <p>가격 : <input type="text" name="price" /></p>
			   <p><input type="submit" value="저장" />
			   <!-- <button>목록</button>  -->
			</form>
			
		</div>
		
	</div>
  
</body>
</html>