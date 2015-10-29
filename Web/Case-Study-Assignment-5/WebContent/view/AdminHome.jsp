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
						Map<String, String> profile = (Map<String, String>)request.getAttribute("profile");
						out.print("<tr><td>Email</td><td>"+profile.get("email")+"</td></tr>");
						out.print("<tr><td>Name</td><td>"+profile.get("name")+"</td></tr>");
						out.print("<tr><td>Contact</td><td>"+profile.get("contact")+"</td></tr>");
						out.print("<tr><td>Address</td><td>"+profile.get("address")+"</td></tr>");
					
				%>
					<tr>
						<td colspan="2"><a href="EditProfileController">Edit Profile</a></td>
					</tr>
				</table>
			 
		</section>

	</div>
</body>
</html>