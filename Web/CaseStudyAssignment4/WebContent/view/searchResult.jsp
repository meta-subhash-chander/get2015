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
	<!--Start the div wrapper -->
	<div id="wrapper">
		<!--Start the div header -->
		<header>
			<div id="head">
				<nav>
					<ul>
						<li><a href="HomeController">Home</a></li>
						<li><a href="LoginController">Login</a></li>
						<li><a href="SearchController">Search</a></li>
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
					</tr>
					<tr>
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
											+ "</td><td><a href='ViewDetailUserController?make="
											+ make + "&model=" + model
											+ "'>View Details</a></td></tr>");
								}
							} catch (Exception e) {
								e.printStackTrace();
							}
						%>
					</tr>
				</table>

			</form>
		</section>
	</div>
</body>
</html>