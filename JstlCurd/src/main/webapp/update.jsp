<%@page import="com.ciq.ems.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- 	<% --%>
	<!-- // 		Employee emp = (Employee) request.getAttribute("empolyee"); -->
	<%-- 	%> --%>

	<%--         <c:set var="empolye" value="${empolyee}"></c:set> --%>
	<%--         <c:forEach var="emp" items="${empolyee}"> --%>

	<%--         <c:out value="${empolyee}"></c:out> --%>
	<%--         </c:forEach> --%>

	<c:set var="emp" value="${empolyee}"></c:set>
	<h1 align="center">Update Employee</h1>
	<form action="./update" method="post">
		<table align="center">

			<tr>
				<td>Eid:</td>
				<%-- 	<!--  <td><input type="text" name="eid" value="<%=emp.getId()%>"></td>-->
			--%>
				<td><input type="text" name="eid" value="${emp.id}"
					readonly="readonly"></td>
			</tr>

			<tr>
				<td>Ename:</td>
				<td><input type="text" name="ename" value="${emp.name}"></td>
				<%--<!--<td><input type="text" name="ename" value="<%=emp.getName()%>"></td>-->
			--%>
			</tr>

			<tr>
				<td>Esal:</td>
				<%--	<!--<td><input type="text" name="esal" value="<%=emp.getSalary()%>"></td>-->
				--%>
				<td><input type="text" name="esal" value="${emp.salary}"></td>
			</tr>

			<tr>
				<td>Email:</td>
				<%-- <!--<td><input type="text" name="email" value="<%=emp.getEmail()%>"></td>-->
				--%>
				<td><input type="text" name="email" value="${emp.email}"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="update"></td>
			</tr>
		</table>
	</form>
	<a href="index.jsp">home page</a>
</body>
</html>