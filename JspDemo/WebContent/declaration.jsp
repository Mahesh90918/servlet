<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!String s = "mahesh";

	String msg(String msg) {
		return msg.toUpperCase();
	}

	String msg(String msg1, String msg2) {
		return msg1.toUpperCase() + msg2.toUpperCase();
	}%>
	<br>
	<%
		out.print("<h1 style='color:red;'>" + msg("message1") + "</h1>");
		out.print("<h1 style='color:cyan;'>" + msg("message") + "</h1>" + "<br>"
				+ msg("<h2 style='color:red;'> message2  </h2>", "<h3 style='color:blue;'> message3  </h3>"));
		out.print(s);
	%>
	<br>
	

	<h1 style="color: cyan;">red</h1>
</body>
</html>