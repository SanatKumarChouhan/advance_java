<%@page import="in.co.rays.bean.UserBean"%>
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
		/*UserBean user = (UserBean) request.getAttribute("user");*/
		UserBean user = (UserBean) session.getAttribute("user");
	%>

	<%
		if (user != null) {
	%>

	<h3>

		Hi,
		<%=user.getFirstname()%>


	</h3>

	<a href="UserCtl.do"><b>User Add</b></a>|
	<a href="UserListCtl.do"><b>User List</b></a>|
	<a href="LoginCtl?operation=logout"><b>Logout</b></a>

	<%
		} else {
	%>

	<h3>Hi, Guist....!!!</h3>

	<%
		}
	%>





</body>
</html>