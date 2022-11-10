<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Register Employee</h1>
	<form action="./save" method="post">
		<table align="center">
			<tr>
				<td>Eid:</td>
				<td><input type="text" name="eid" placeholder="Enter eid"
					required="required"></td>
			</tr>

			<tr>
				<td>Ename:</td>
				<td><input type="text" name="ename" placeholder="Enter name"
					required="required"></td>
			</tr>

			<tr>
				<td>Esal:</td>
				<td><input type="text" name="esal" placeholder="Enter salary"
					required="required"></td>
			</tr>

			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" placeholder="Enter Email"
					required="required"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="save"></td>
			</tr>
		</table>
	</form>
	<a href="index.jsp" style="color:red">home page</a>
</body>
</html>