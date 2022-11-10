<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>student response</p>
	<%
		String firstname = request.getParameter("fs");
		String lastname = request.getParameter("ls");
		String fullName = firstname + " " + lastname;
		out.print(fullName);
	%>
	<br>
	<br> Select tag reading the data:
	<br>
	<%
		String country = request.getParameter("country");
		out.print(country);
	%>
	<br>
	<br> checkbox tag reading the data:
	<br>
	<%
		String checkbox = request.getParameter("ch");

		out.print(checkbox);
	%>
	<br>
	<br> checkbox group of data reading the data:
	<br>
	<%
		String[] checkbox1 = request.getParameterValues("ch");
		for (String ch : checkbox1) {
			out.print(ch + "<br>");
		}
	%>
	<br>
	<br>radio data reading :
	<br>
	<br>
	<%
		String radio = request.getParameter("radio");
		out.print(radio);
	%>
 <br>
	<br> Date reading :
	<br>
	<br><%
		String date = request.getParameter("dob");
		out.print(date);
	%>
	</br> </br>
		file reading :
		</br> </br>
		<%
		String file = request.getParameter("file");
		out.print(file);
	%>
	
</body>
</html>