<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>九九表を作ってみよう</title>
</head>
<body>
<h1>九九表</h1>
<table border="1">
<tr>
	<th></th><th>1</th><th>2</th><th>3</th><th>4</th>
	<th>5</th><th>6</th><th>7</th><th>8</th><th>9</th>
</tr>
<%
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
%>
</table>
</body>
</html>