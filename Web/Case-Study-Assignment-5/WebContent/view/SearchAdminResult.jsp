<%@page import="java.util.*"%>
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
								String make = request.getAttribute("make").toString();
								List<String> modelList = (List<String>)request.getAttribute("model");
								Iterator<String> modelIterator = modelList.iterator();
								while(modelIterator.hasNext()) {
									String model = modelIterator.next();
									out.print("<tr><td>"+make+"</td><td>"+model+"</td><td><a href='ViewDetailController?make="+make+"&model="+model+"'>View Details</a></td><td><a href='EditCarController?make="+make+"&model="+model+"'>Edit</a></td></tr>");
								}
							
						%>

				</table>

			</form>
		</section>
	</div>
</body>
</html>