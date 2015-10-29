<%@page import="java.util.*" %>
<%@page import="com.model.*" %>
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
						<li><a href="SearchAdminController">Search</a></li>
						<li class="logout"><a href="LogoutController">Logout</a></li>
					</ul>
				</nav>
			</div>
			<img src="./image/car.png" id="image" />
		</header>
		<!--Start the div section -->
		<section class="section5">
			<img src="./image/swift.jpg"></img>
			<table>
				<%
				
					List<Vehicle> vehicles = (List<Vehicle>)request.getAttribute("vehicles");
					Iterator<Vehicle> iterator = vehicles.iterator();
					while(iterator.hasNext()) {
						Vehicle vehicle = iterator.next();
						out.print("<tr><td>Make</td><td>"+vehicle.getMake()+"</td></tr>");
						out.print("<tr><td>Model</td><td>"+vehicle.getModel()+"</td></tr>");
						out.print("<tr><td>EngineInCC</td><td>"+vehicle.getEnginInCC()+"</td></tr>");
						out.print("<tr><td>FuelCapacity</td><td>"+vehicle.getFuelCapacity()+"</td></tr>");
						out.print("<tr><td>Milage</td><td>"+vehicle.getMilage()+"</td></tr>");
						out.print("<tr><td>Price</td><td>"+vehicle.getPrice()+"</td></tr>");
						out.print("<tr><td>RoadTax</td><td>"+vehicle.getRoadTax()+"</td></tr>");
						out.print("<tr><td>AC</td><td>"+((Car)vehicle).isAC()+"</td></tr>");
						out.print("<tr><td>AccessoryKit</td><td>"+((Car)vehicle).isAccessoryKit()+"</td></tr>");
						out.print("<tr><td>PowerSteering</td><td>"+((Car)vehicle).isPowerSteering()+"</td></tr>");
					}
				
				%>
			</table>
			
		</section>
	</div>
</body>
</html>