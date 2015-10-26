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
						<li class="active"><a href="#">My Home</a></li>
						<li><a href="CreateController">Create</a></li>
						<li><a href="SearchAdminController">Search</a></li>
						<li><a href="LogoutController">Logout</a></li>
					</ul>
				</nav>
			</div>
			<img src="./image/car.png" id="image" />
		</header>
		<!--Start the div loginBoxForAdmin -->
		<section class="sectionAdmin">
			<h1>Admin Profile</h1>
			<table>
				<%
					try {
						ResultSet rs = VehicleJDBCHelper.adminProfile();
						rs.next();
						out.print("<tr><td>Email</td><td>" + rs.getString("email")
								+ "</td></tr>");
						out.print("<tr><td>Name</td><td>" + rs.getString("name")
								+ "</td></tr>");
						out.print("<tr><td>Contact</td><td>" + rs.getString("contact")
								+ "</td></tr>");
						out.print("<tr><td>Address</td><td>" + rs.getString("address")
								+ "</td></tr>");
					} catch (Exception e) {
						System.out.print(e.getMessage());
						e.printStackTrace();
					}
				%>
				<tr>
					<td colspan="2"><a href="EditProfileController">Edit
							Profile</a></td>
				</tr>
			</table>
		</section>

	</div>
</body>
</html>