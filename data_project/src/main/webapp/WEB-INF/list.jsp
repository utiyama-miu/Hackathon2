<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>データベースの接続確認</title>
</head>
<body>
	<% List<String> members = (List<String>)request.getAttribute("members"); %>
	
	<p>テーブルに保存されている本のタイトル一覧</p>
	<% for(String name: members) { %>
		<%= name %><br>
	<% } %>
</body>
</html> 