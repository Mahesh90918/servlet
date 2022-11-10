<%@page import="com.jspWithServlet.student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>student class data reading</p>
	<%
		out.print(student.name("mahesh"));
	%>
</body>
</html>