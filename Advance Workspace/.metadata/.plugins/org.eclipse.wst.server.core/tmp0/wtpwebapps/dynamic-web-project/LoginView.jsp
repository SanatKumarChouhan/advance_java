<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String msg = (String) request.getAttribute("msg");

		String uri = (String) request.getAttribute("uri");
	%>

	<%@ include file="Header.jsp"%>


	<hr>
	<form action="LoginCtl" method="post">
		<%
			if (msg != null) {
		%>
		<h3><%=msg%></h3>
		<%
			}
		%>

		<table>


			<tr>

				<th>Login Id</th>
				<td><input type="text" name="loginid"></td>


			</tr>


			<tr>

				<th>Password</th>
				<td><input type="text" name="password"></td>


			</tr>

			<tr>

				<td><input type="submit" name="operation" value="signIn"><input
					type="submit" name="operation" value="signUp"></td>

			</tr>

		</table>

		<input type="hidden" name="uri" value="<%=uri%>">

	</form>



</body>
</html>