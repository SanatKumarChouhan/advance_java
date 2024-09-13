<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="bean" class="in.co.rays.bean.UserBean" scope="request"></jsp:useBean>
	<jsp:setProperty name="bean" property="*" />
	<jsp:setProperty name="bean" property="firstname" param="firstName" />
	<jsp:setProperty name="bean" property="address" value="fixxxx"/>

	<form action="" method="post">

		<table>

			<tr>
				<th>First Name:</th>
				<td><input type="text" name="firstName"></td>
			</tr>


			<tr>
				<th>Last Name:</th>
				<td><input type="text" name="lastname"></td>
			</tr>


			<tr>
				<th>Login Id:</th>
				<td><input type="text" name="loginid"></td>
			</tr>


			<tr>
				<th>Password:</th>
				<td><input type="text" name="password"></td>
			</tr>


			<tr>
				<th>Date Of Birth:</th>
				<td><input type="date" name="dob"></td>
			</tr>


			<tr>
				<th>Address:</th>
				<td><input type="text" name="address"></td>
			</tr>


			<tr>
				<th></th>
				<td><input type="submit" name="operation" value="signUp"></td>
			</tr>


		</table>

	</form>

	<%
		String op = (String) request.getParameter("operation");
		if (op != null) {
	%>

	<%=bean.getFirstname()%>
	<%=bean.getLastname()%>
	<%=bean.getLoginid()%>
	<%=bean.getPassword()%>
	<%=bean.getDob()%>
	<%=bean.getAddress()%>

	<%
		}
	%>


</body>
</html>