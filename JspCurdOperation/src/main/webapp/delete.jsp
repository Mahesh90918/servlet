<%@page import="com.ciq.ems.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
           Employee emp=(Employee)request.getAttribute("delete");
%>

	<form action="./delete" method="get">
		Enter ID: <input type="text" name="eid" value="<%=emp.getId()%>"><br> <br> <input
			type="submit" value="delete" />


	</form>
	<a href="index.jsp">home page</a>
</body>
</html>