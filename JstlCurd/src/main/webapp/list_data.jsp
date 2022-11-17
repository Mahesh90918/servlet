<%@page import="com.ciq.ems.model.Employee"%>
<%@page import="java.util.List" isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p>list of data</p>

	<%-- 	<c:forEach var="emp1" items="${mahesh}"> --%>
	<%--                ${emp1} --%>
	<%--     </c:forEach> --%>

	<table border="1px;">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SALARY</th>
			<th>EMAIL</th>
		</tr>
		<c:forEach var="emp" items="${mahesh}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.salary}</td>
				<td>${emp.email}</td>
				<td><a href="update?mahesh=${emp.id}">Edit</a> <a
					href="delete?eid=${emp.id}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<div>
		<p>
			<a href="index.jsp">home page</a><br> <br> <a
				href="save.jsp">add new Data </a>
		</p>
	</div>
</body>
</html>
