<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>自己紹介</title>
</head>
<body>
	<p><%= request.getAttribute("id") %>こんにちは！僕の名前は<%= request.getAttribute("name") %>です！</p>
	<p>年齢は<%=request.getAttribute("hometown") %>さいです</p>
</body>
</html>