<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Patient Details</title>
<link rel="stylesheet" href="/css/udoctorfindbyid.css">
</head>
<body>
	<div class="login-page">
	<h6>
		<a href="/login">LogOut</a>
	</h6>
		<div class="form">
			<div class="login">
				<div class="login-header">
					<p>Search for Patients by Surgery Name</p>
				</div>
			</div>
			<form class="login-form" method="post" action="joincp">
				<input type="text" name="cp" placeholder="Surgery Name"></input>
				<button type="submit">Search</button>

			</form>
			<h5>
				<a href="/join/userhome">go to Join Operation's Home Page</a>
			</h5>
			<p></p>
			<h5>
				<a href="/userhome">go to User Home Page</a>
			</h5>
		</div>
	</div>
</body>
</html>