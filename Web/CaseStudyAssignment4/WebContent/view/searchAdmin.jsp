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
						<li><a href="AdminHomeController">My Home</a></li>
				<li><a href="CreateController">Create</a></li>
				<li class="active"><a href="#">Search</a></li>
				<li class="logout"><a href="LogoutController">Logout</a></li>
					</ul>
				</nav>
			</div>
			<img src="./image/car.png" id="image" />
		</header>
		<section class="section2">
			<form action="SearchAdminController" method="post">
				<h2>Select Details</h2>
				<table>
					<tr>
						<td class="text">Select Make:</td>
						<td><input type="text" list="make" name="make" required
							placeholder="Select Make" class="list"> <datalist
								id="make">
								<%
									try {
										ResultSet rs = VehicleJDBCHelper.distictMake();
										while (rs.next()) {
											out.print("<option value=" + rs.getString("make") + ">");
										}
									} catch (Exception e) {
										e.printStackTrace();
									}
								%>
							</datalist></td>
					</tr>
					<tr>
						<td colspan="2" align="center" class="button"><input
							type="submit" name="type" class="button" value="Search"></td>
					</tr>
				</table>
			</form>
		</section>
	</div>
</body>
</html>