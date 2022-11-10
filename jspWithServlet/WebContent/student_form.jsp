<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>student form</p>

	Student details:
	<form action="student_response.jsp">
		first name:<input type="text" name="fs"> last name:<input
			type="text" name="ls"> <input type="submit" value="submit">
		<br> <br> Country Details: <select name="country">
			<option>usa</option>
			<option>jsp</option>
			<option>india</option>
			<option>chy</option>
			<option>can</option>

		</select> <br> <br> checkBox data reading :<br> <br> <input
			type="checkbox" value="india" name="ch">india <input
			type="checkbox" value="pak" name="ch">pak <input
			type="checkbox" value="sri" name="ch">sri <input
			type="checkbox" value="usa" name="ch">usa <input
			type="checkbox" value="rrr" name="ch">rrr <br> <br>
		radio data reading :<br> <br> <input type="radio"
			name="radio" value="MALE">MALE <input type="radio"
			name="radio" value="FEMALE">FEMALE <br> <br> Date
		reading : <br> <br> <input type="date" name="dob"> </br>
		</br> file : </br> </br> <input type="file" name="file"></br> </br>
	</form>
</body>
</html>