<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Doctor's Details</title>
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
					<p>Search Doctor's Data</p>
				</div>
			</div>
			<form class="login-form" method="post" action="userfindbyid">
				<input type="number" name="did" placeholder="Doctor's ID"></input>	
				<button type="submit">Submit</button>

			</form>
			<h5>
				<a href="/doctor/userhome">go to Doctor's User Home Page</a>
			</h5>
			<p></p>
			<h5>
				<a href="/userhome">go to User Home Page</a>
			</h5>
		</div>
	</div>
</body>
</html>