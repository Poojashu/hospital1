<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Room's Details</title>
<link rel="stylesheet" href="/css/staffsadd.css">
</head>
<body>
	<div class="login-page">
		<h6>
			<a href="/login">LogOut</a>
		</h6>
		<div class="form">
			<div class="login">
				<div class="login-header">
					<p>Insert/Update Room Details</p>
				</div>
			</div>
			<form class="login-form" method="post" action="add">
				<input type="number" name="roomno" placeholder="Room Number"> 
				<input type="text" name="location" placeholder="Room's Location">
				<button type="submit">Submit</button>
			</form>
			<h5>
				<a href="/room/home">go to Room's Home Page</a>
			</h5>
			<p></p>
			<h5>
				<a href="/home">go to Home Page</a>
			</h5>
		</div>
	</div>
</body>
</html>