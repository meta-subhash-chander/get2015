<%@page import="java.io.IOException"%>
<%@page import="java.sql.*"%>
<%@page import="com.helper.*"%>
<%@page import="com.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- link with css file -->
<link href="./css/style1.css" rel="stylesheet" />
<!-- link with java script file -->
<script type="text/javascript" src="./javascript/carDekho.js"></script>
<title>Admin log in</title>
</head>
<body>
	<%
		HttpSession s = request.getSession();
		if (s.getAttribute("email") == null)
			response.sendRedirect("index.jsp");
	%>
	<!--Start the div wrapper -->
	<div id="wrapper">
		<!--Start the div header -->
		<header>
			<div id="head">
				<nav>
					<ul>
						<li><a href="AdminHomeController">My Home</a></li>
						<li><a href="CreateController">Create</a></li>
						<li><a href="SearchAdminController">Search</a></li>
						<li class="logout"><a href="LogoutController">Logout</a></li>
					</ul>
				</nav>
			</div>
			<img src="./image/car.png" id="image" />
		</header>
		<section class="section4">
			<form action="#">

				<h2>Car Details</h2>
				<table>
					<tr>
						<th>Make</th>
						<th>Model</th>
						<th>View Details</th>
						<th>Edit Car</th>
					</tr>
					<%
						String make = request.getParameter("make");
						try {
							ResultSet rs = VehicleJDBCHelper.searchModel(make);
							String model;
							while (rs.next()) {
								model = rs.getString("model");
								out.print("<tr><td>"
										+ make
										+ "</td><td>"
										+ model
										+ "</td><td><a href='ViewDetailController?make="
										+ make
										+ "&model="
										+ model
										+ "'>View Details</a></td><td><a href='EditCarController?make="
										+ make + "&model=" + model + "'>Edit</a></td></tr>");
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					%>

				</table>

			</form>
		</section>
	</div>
</body>
</html>