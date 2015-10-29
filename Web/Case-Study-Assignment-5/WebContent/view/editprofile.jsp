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
						<li><a href="LogoutController">Logout</a></li>
					</ul>
				</nav>
			</div>
			<img src="./image/car.png" id="image" />
		</header>
		<!--Start the div section -->
		<section class="sectionAdmin">
			<h1>Update Details</h1>
			<form action="EditProfileController" method="post">
				<table>
					<%

						Map<String, String> profile = (Map<String, String>)request.getAttribute("profile");
						out.print("<tr><td>Email</td><td><input type='text' class='field' name='email' required value='"+profile.get("email")+"'></td></tr>");
						out.print("<tr><td>Name</td><td><input type='text' class='field' name='name' required value='"+profile.get("name")+"'></td></tr>");
						out.print("<tr><td>Password</td><td><input type='password' class='field' name='password' required value='"+profile.get("password")+"'></td></tr>");
						out.print("<tr><td>Contact</td><td><input type='text' class='field' name='contact' required value='"+profile.get("contact")+"'></td></tr>");
						out.print("<tr><td>Address</td><td><input type='text' class='field' name='address' required value='"+profile.get("address")+"'></td></tr>");

				%>
					<tr>
						<td colspan="2"><input type="submit" class="button"
							value="Submit"></td>
					</tr>
				</table>
			</form>
		</section>
	</div>
</body>
</html>