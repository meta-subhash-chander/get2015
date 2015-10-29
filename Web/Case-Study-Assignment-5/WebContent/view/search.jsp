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
						<li><a href="HomeController">Home</a></li>
						<li><a href="LoginController">Login</a></li>
						<li class="active"><a href="#">Search</a></li>
					</ul>
				</nav>
			</div>
			<img src="./image/car.png" id="image" />
		</header>
		<!--Start the div section -->
		<section class="section2">
			<form action="SearchController" method="post">
				<h2>Select Details</h2>
				<table>
					<tr>
						<td class="text">Select Make:</td>
						<td><input type="text" list="make" name="make" required
							placeholder="Select Make" class="list"> <datalist
								id="make">
								<%
								
								List<String> make = (List<String>)request.getAttribute("make");
								if(make.size() != 0) {
									Iterator<String> iterator = make.iterator();
									while(iterator.hasNext()) {
										out.print("<option value="+iterator.next()+">");
									}
								}
				
								%>
							</datalist></td>
					</tr>
					<tr>
						<td colspan="2" align="center" class="button"><input
							type="submit" name="submit" class="button"></td>
					</tr>
				</table>
			</form>
		</section>
	</div>
</body>
</html>