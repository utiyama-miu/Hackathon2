<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>基本的な表の作成</title>
</head>
<body>
	<form method="GET" action="sample2">
<table border="1">
 <tr>
    <th>ID</th>
    <th>生年月日</th>
    <th>年齢</th>
    <th>出身地</th>
</tr>
<tr>
  <td><%
for(int i=1;i<10;i++){
	out.println("<tr>");
	out.println("<th>" + i + "</th>");
	// 内側のループの開始
	for(int j=1;j<10;j++){
		out.println("<td align='right' width='20'>" + (i*j) + "</td>");
	}
	// 内側のループの終了
	out.println("</tr>");
}
%></td>
   <td></td>
  <td></td>
  <td></td>
  <td><input type="submit" value="送信">
    </td>
</table>
</form>
</body>
</html>