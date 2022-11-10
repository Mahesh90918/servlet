<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>sarada program</p>
	<%!public int add(int id) {
		return id;
	}

	public void sum(int id) {
		System.out.print(id);

	}%>
	<%
		out.print(add(10));
	%>

	<%!class mahesh {
		public void sum1(int id) {
			System.out.print(id);
		}

		public int add1(int id) {
			return id;
		}

	}%>
	<%
		out.print(add(89));
	%>
	<%
		mahesh m = new mahesh();
		m.sum1(100);
		out.print(m);
	%>


</body>
</html>