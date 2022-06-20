<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>入力フォーム</p>
<form method="post" action="/insert/CreateServlet">
	<!--id:<input type="text" name="id"><br>-->
	name:<input type="text" name="name"><br>
	hometown:<input type="text" name="hometown"><br>
	<button type="submit">送信</button>
</form>
</body>
</html>