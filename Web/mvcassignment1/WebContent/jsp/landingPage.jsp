<%@page import="com.helper.EmployeeHelper"%>
<%@page import="com.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Metacube</title>
<link href="../css/formCss.css" rel="stylesheet" />
</head>
<body>
<% 
EmployeeHelper.loadEmployee();

%>

	<a href="../ShowList">List Of Employee</a><br>
	<a href="../DoPrepareForm?id=-1">Register Employee</a>
</body>
</html>