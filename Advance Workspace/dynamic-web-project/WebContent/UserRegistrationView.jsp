<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Rays Technologies</h1>

	<form action="UserRegistrationCtl" method="post">

		<table>
			<tr>
				<th>First Name</th>
				<td><input type="text" name="firstname"></td>



			</tr>

			<tr>
				<th>Last Name</th>
				<td><input type="text" name="lastname"></td>

			</tr>

			<tr>
				<th>LogIn Id</th>
				<td><input type="text" name="loginid"></td>


			</tr>

			<tr>
				<th>Password</th>
				<td><input type="text" name="password"></td>


			</tr>

			<tr>
				<th>Date of Birth</th>
				<td><input type="date" name="dob"></td>


			</tr>

			<tr>
				<th>Address</th>
				<td><input type="text" name="address"></td>


			</tr>
			
			</tr>
			
			<th>
			<input type="submit" name="signup">
			</th>
			<tr>
		</table>


	</form>

</body>
</html>