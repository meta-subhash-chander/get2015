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
						<li class="active"><a href="#">Login</a></li>
						<li><a href="SearchController">Search</a></li>
					</ul>
				</nav>
			</div>
			<img src="./image/car.png" id="image" />
		</header>
		<!--Start the div loginBoxForAdmin -->
		<div id="loginBoxForAdmin">
			<form action="LoginController" name="loginform" method="post">
				<h3 align="center">
					<u>Admin Log In</u>
					
				</h3>
				<div>
					<h3 align="center">User Name :</h3>
					<p align="center">
						<input type="email" required name="email"
							placeholder="Enter Email Id" id="id" >
					</p>
				</div>
				<div>
					<h3 align="center">Password :</h3>
					<p align="center">
						<input type="password" required="required"
							name="password" placeholder="Enter Password"
							id="password"></td>
					</p>
				</div>
				<p align="center">
					<input type="submit" name="submit" id="submit" value="Log-in"
						class="btnStyle" /><br>
						<h2> <%
								if (request.getParameter("message") != null) {
									out.print(request.getParameter("message"));
								}
							%> ${message}
							</h2>
				</p>
			</form>
		</div>
		
	</div>
</body>
</html>