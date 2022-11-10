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
	<div></div>
	<p>list of data</p>
	<%
		List<Employee> ll = (List<Employee>) request.getAttribute("empolyee");
		
	%>
	<%String message = (String) request.getAttribute("msg");
	message = message == null ? "" : message;
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
			<td><a href="update?eid=<%=emp.getId()%>">Edit</a> <a
				href="delete?eid=<%=emp.getId()%>">delete</a></td>
		</tr>
		<%
			}
		%>
		</div>
		<br>
		<br>
		<div>
			<p>
				<a href="index.jsp">home page</a><br><br>
				<a href="save.jsp">add new Data </a>
			</p>
		</div>
</body>
</html>
