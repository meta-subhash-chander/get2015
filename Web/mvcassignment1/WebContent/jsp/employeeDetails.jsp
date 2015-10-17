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
		Employee employee = (Employee) request.getAttribute("employee");
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
			<table class="table">



				<tr>
					<td>Employee Id</td>
					<td><%=employee.getEmployeeId()%></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><%=employee.getName()%></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><%=employee.getEmail()%></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><%=employee.getAge()%></td>
				</tr>
				<tr>
					<td>Date Of Registration</td>
					<td><%=employee.getDateOfRegistration()%></td>
				</tr>
				<tr>
					<td><a href="/mvcassignment1/DoPrepareForm?id=-1">Register
							Here</a></td>
				</tr>
			</table>
		</div>
		<footer>&copy 2011 Metacube Software Pvt. Ltd. All rights
		reserved. </footer>
	</div>
</body>
</html>
