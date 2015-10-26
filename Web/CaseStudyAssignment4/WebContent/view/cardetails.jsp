<%@page import="java.util.*"%>
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
		<section class="section5">
			<img src="./images/car_image.jpg"></img>
			<table>
				<%
					String make = request.getAttribute("make").toString();
					String model = request.getAttribute("model").toString();
					List<Vehicle> vehicles = VehicleJDBCHelper.searchByMakeAndModel(
							make, model);
					Iterator<Vehicle> iterator = vehicles.iterator();
					while (iterator.hasNext()) {
						Vehicle vehicle = iterator.next();
						out.print("<tr><td>Make</td><td>" + vehicle.getMake()
								+ "</td></tr>");
						out.print("<tr><td>Model</td><td>" + vehicle.getModel()
								+ "</td></tr>");
						out.print("<tr><td>EngineInCC</td><td>"
								+ vehicle.getEnginInCC() + "</td></tr>");
						out.print("<tr><td>FuelCapacity</td><td>"
								+ vehicle.getFuelCapacity() + "</td></tr>");
						out.print("<tr><td>Milage</td><td>" + vehicle.getMilage()
								+ "</td></tr>");
						out.print("<tr><td>Price</td><td>" + vehicle.getPrice()
								+ "</td></tr>");
						out.print("<tr><td>RoadTax</td><td>" + vehicle.getRoadTax()
								+ "</td></tr>");
						out.print("<tr><td>AC</td><td>" + ((Car) vehicle).isAC()
								+ "</td></tr>");
						out.print("<tr><td>AccessoryKit</td><td>"
								+ ((Car) vehicle).isAccessoryKit() + "</td></tr>");
						out.print("<tr><td>PowerSteering</td><td>"
								+ ((Car) vehicle).isPowerSteering() + "</td></tr>");
					}
				%>

			</table>

		</section>

	</div>
</body>
</html>