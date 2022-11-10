<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>The code placed within JSP expression tag is written to the
		output stream of the response. So you need not write out.print() to
		write data.</p>
	<br>
	<br>
	<%="Welcome " + request.getParameter("uname")%>
	<br>

	<%=new Date()%>
	<br>

	<%="It is mainly used to print the values of variable " + "or method"%>

	<br>
	<br>
	<%
		String s = "It is mainly used to print the values of variable " + "or method";
		out.print(s);
	%>
	<%
		final int x = 20; // invalid, x is not final
		out.println(x * 2);
	%>

</body>
</html>