<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>A scriptlet tag is used to execute java source code in JSP</p>
	<%
		int a = 10;
		out.print(a);
	%>
	<%
		out.print("<br>" + a);
		out.print("<br>  Welcome to Scriptlet");
	%>
	<br>
	<p>we are printing the username using the Scriptlet tag</p>
	<%
		String name = request.getParameter("uname");
		out.print("<h1>" + "name = " + name + "</h1>");
	%>
	<br>
	<%
		String s = "java source code in JSP";
		out.print(s);
	%>
	
</body>
</html>