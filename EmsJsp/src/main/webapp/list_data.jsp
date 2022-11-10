<%@page import="com.ciq.ems.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>list of data</p>
	<%
		List<Employee> ll = (List<Employee>) request.getAttribute("emps");
	%>
	<%
		out.print(ll);
	%>
	<table border="1px;">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SALARY</th>
			<th>EMAIL</th>
		</tr>
		<%
			for (Employee emp : ll) {
		%>
		<tr>
			<td><%=emp.getId()%></td>
			<td><%=emp.getName()%></td>
			<td><%=emp.getSalary()%></td>
			<td><%=emp.getEmail()%></td>
			<td><a href="edit?id=<%=emp.getId()%>">Edit</a>
			 <a href="#">delete</a></td>
		</tr>

		<%
			}
		%>
	
</body>
</html>