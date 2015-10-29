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
		<section class="section1">
			<form action="EditCarController" method="post">

				<h2>Update Details</h2>
				<table>
						<%
							
								List<Vehicle> vehicles = (List<Vehicle>)request.getAttribute("vehicles");
								Iterator<Vehicle> iterator = vehicles.iterator();
								iterator.hasNext();
								Vehicle vehicle = iterator.next();
							 
						%>
						<tr><td class="text">Name:</td>
							<td><input type="text" required name="name" readonly value=<% out.print(vehicle.getCreated_By());%> id="t1" class="field" pattern="[a-zA-Z]{2,}[a-zA-Z ]{0,}"></td></tr>
						<tr><td class="text">Make:</td>
							<td><input type="text" required="required" readonly name="make"  class="field" id="t4" value=<% out.print(vehicle.getMake());%>></td></tr>
						<tr><td class="text">Model:</td>
							<td><input type="text" required="required" readonly name="model"  class="field" id="t6" value=<% out.print(vehicle.getModel());%>></td></tr>
						<tr><td class="text">EngineIncc:</td>
							<td><input type="text" required="required" name="enginecc"  class="field" value=<% out.print(vehicle.getEnginInCC());%> id="t2"></td></tr>	
						<tr><td class="text">FuelCapacity:</td>
							<td><input type="text" required="required" name="fuelcapacity"  class="field" value=<% out.print(vehicle.getFuelCapacity());%> id="t3"></td></tr>						
						<tr><td class="text">Milage:</td>
							<td><input type="text" required="required" name="milage"  class="field" id="t5" value=<% out.print(vehicle.getMilage());%>></td></tr>						
						<tr><td class="text">Price:</td>
							<td><input type="text" required="required" name="price"  class="field" id="t7" value=<% out.print(vehicle.getPrice());%>></td></tr>
						<tr><td class="text">AC:</td>
						<td class="text1"><input type="radio" required="required" name="ac" <% if(((Car)vehicle).isAC()) out.print("checked='checked'");%> value="yes" class="radioField" id="t8">YES
								<input type="radio" required="required" name="ac" value="no" <% if(!((Car)vehicle).isAC()) out.print("checked='checked'");%>  class="radioField" id="t8">NO</td></tr>
						<tr><td class="text">Accessory Kit:</td>
						<td class="text1"><input type="radio" required="required" name="accessorykit" <% if(((Car)vehicle).isAccessoryKit()) out.print("checked='checked'");%> value="yes"  class="radioField" id="t9">YES
								<input type="radio" required="required" name="accessorykit" value="no" <% if(!((Car)vehicle).isAccessoryKit()) out.print("checked='checked'");%> class="radioField" id="t9">NO</td></tr>
						<tr><td class="text">Power Steering:</td>
						<td class="text1"><input type="radio" required="required" name="powersteering" value="yes" <% if(((Car)vehicle).isPowerSteering()) out.print("checked='checked'");%> class="radioField" id="t10">YES
								<input type="radio" required="required" name="powersteering" value="no" <% if(!((Car)vehicle).isPowerSteering()) out.print("checked='checked'");%> class="radioField" id="t10">NO</td></tr>
						<tr></tr>
						<tr><td colspan="2" align="center"><input type="submit" name="type" value="Delete" class="button">
						<input type="submit" name="type" value="Update" class="button"></td>
						</tr>
					</table>

			</form>
		</section>
	</div>
</body>
</html>