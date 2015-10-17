<%@page import="com.model.Employee"%>
<%@page import="java.util.Map"%>
<%@page import="com.helper.EmployeeHelper"%>
<%@page import="com.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/metacube.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Metacube</title>
</head>
<body>
	<%
		String employId = "";
		String name = "";
		String email = "";
		String age = "";
		String submitValue = "Register";
		String formAction = "/mvcassignment1/DoRegister";
		int id = -1;
		String read = "";
		Object employee = request.getAttribute("employee");
		read = (String) request.getAttribute("read");
		if (employee instanceof Employee) {
			Employee employee2 = (Employee) employee;
			employId = "" + employee2.getEmployeeId();
			name = employee2.getName();
			email = employee2.getEmail();
			age = "" + employee2.getAge();
			submitValue = "Edit";
			formAction = "/mvcassignment1/DoEdit";
			id = (Integer) request.getAttribute("id");

		}
	%>

	<div id="wrapper">
		<header> METACUBE SOFTWARE </header>
		<div id="container">
			<div id='cssmenu'>
				<ul>
					<li class='active'><a href="jsp/landingPage.jsp"><span>Home</span></a></li>
					<li><a href="ShowList">List Of Employee</a></li>
					<li><a href="DoPrepareForm?id=-1">Register Employee</a></li>
					<li class='last'><a href='#'><span>Contact</span></a></li>
				</ul>
			</div>
			<form method="post" action="<%=formAction%>">
				<table class="table">
					<tr>
						<td>Employee Id</td>
						<td><input type="text" name="employId" value="<%=employId%>"
							<%=read%> required></td>
					</tr>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name" value="<%=name%>" required></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="email" name="email" value="<%=email%>"
							required></td>
					</tr>
					<tr>
						<td>Age</td>
						<td><input type="number" name="age" value="<%=age%>" required></td>
					</tr>
					<tr>
						<td style="color: red">${message}</td>
						<td><input type="submit" name="submit"
							value="<%=submitValue%>"></td>
					</tr>

				</table>
				<input type="hidden" name="id" value="<%=id%>">
			</form>

		</div>
		<footer>&copy 2015 Metacube Software Pvt. Ltd. All rights
		reserved. </footer>
	</div>
</body>
</html>
