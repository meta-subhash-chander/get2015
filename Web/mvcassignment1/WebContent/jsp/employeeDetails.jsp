<%@page import="com.model.Employee"%>
<%@page import="java.util.Map"%>
<%@page import="com.helper.EmployeeHelper"%>
<%@page import="com.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Connect with css file -->
<link href="css/metacube.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Metacube</title>
</head>
<body>
	<!-- get attribute employee-->
	<%
		Employee employee = (Employee) request.getAttribute("employee");
	%>
	<!-- start division wrapper-->
	<div id="wrapper">
		<!-- start division header-->
		<header> METACUBE SOFTWARE </header>
		<!-- start division container-->
		<div id="container">
			<!-- start division cssmenu-->
			<div id='cssmenu'>
				<ul>
					<li class='active'><a href="jsp/landingPage.jsp"><span>Home</span></a></li>
					<li><a href="ShowList">List Of Employee</a></li>
					<li><a href="DoPrepareForm?id=-1">Register Employee</a></li>
					<li class='last'><a href='#'><span>Contact</span></a></li>
				</ul>
			</div>
			<!-- start  table tag-->
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
		<footer>&copy 2015 Metacube Software Pvt. Ltd. All rights
		reserved. </footer>
	</div>
</body>
</html>
