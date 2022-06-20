<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,java.util.List,nogizaka.Nogizakalist" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>乃木坂メンバー50音順一覧</title>
</head>
<body>
	<% List<Nogizakalist> books = (List<Nogizakalist>)request.getAttribute("books"); %>
	<table>
	<tr>
	<th> 乃木坂メンバーID</th>
	<th>乃木坂メンバー名前</th>
	<th>乃木坂メンバー生年月日</th>
	<th>乃木坂メンバー年齢</th>
	<th>乃木坂メンバー出身地</th>
	<th>乃木坂メンバーの詳細</th>
	<th></th>
	</tr>
	<tr>
	<%for(Nogizakalist members:books){ %>
	<td><%=members.getID() %></td>
	<td><%=members.getName() %></td>
	<td><%=members.getDateofbirth() %></td>
	<td><%=members.getOld() %></td>
	<td<%=members.getBirthplace() %>></td>
	<td><%=members.getDetail() %></td>
	<td><a href ="/TestSample/Detailpage?<%=members.getID()%>">詳細</a></td>
	</tr>
	<%} %>
	</table>
</body>
</html> 