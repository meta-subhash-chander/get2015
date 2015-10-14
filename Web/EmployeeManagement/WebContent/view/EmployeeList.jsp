<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.Employee , java.util.* " %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
</head>
<body>
	
	<p>${heading}</p>
	<% List<Employee> list = (List<Employee>) request.getAttribute("employeeList");
		out.println("Employee Id\t\tName\t\tEmail");	
		for(Employee e : list) {
			out.println(e.getEmpId()+"\t\t"+e.getName()+"\t\t"+e.getEmail()
			+"<a href='EmployeeDetailController?id="+e.getEmpId()+"'> Details</a>"
			+"<a href='EmployeeDetailController?id="+e.getEmpId()+"'> Edit</a>");
		}
	
	%>
	
</body>
</html>