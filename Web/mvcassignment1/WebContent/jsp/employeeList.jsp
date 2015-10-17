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
					<th>EmployeeId</th>
					<th>Name</th>
					<th>Email</th>
					<th>date</th>
					<th>View Details</th>
					<th>Edit</th>
				</tr>

				<%
					Map<Integer, Employee> listOfEmployee = (Map<Integer, Employee>) request
							.getAttribute("listOfEmployee");
					for (int i : listOfEmployee.keySet()) {

						out.print("<tr>");
						out.print(" <td>" + listOfEmployee.get(i).getEmployeeId()
								+ "</td><td>" + listOfEmployee.get(i).getName()
								+ "</td><td>" + listOfEmployee.get(i).getEmail()
								+"</td><td>" + listOfEmployee.get(i).getDateOfRegistration()
								+ "</td>"
						
						+"</td><td><a href='/mvcassignment1/DoGetDetails?id="+i+"' >View Details<a</td>"
						+"</td><td><a href='/mvcassignment1/DoPrepareForm?id="+i+"' >Edit<a</td></tr>");
						
				
					}
				%>
			</table>
		</div>
		<footer>&copy 2011 Metacube Software Pvt. Ltd. All rights
		reserved. </footer>
	</div>
</body>
</html>
