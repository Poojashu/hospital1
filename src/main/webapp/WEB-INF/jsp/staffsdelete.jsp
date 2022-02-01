<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Staff's Details</title>
<link rel="stylesheet" href="/css/staffsdelete.css">
</head>
<body>
	<div class="login-page">
		<h6>
			<a href="/login">LogOut</a>
		</h6>
		<div class="form">
			<div class="login">
				<div class="login-header">
					<p>Delete Staff Data</p>
				</div>
			</div>
			<form class="login-form" method="post" action="delete">
				<input type="number" name="id" placeholder="Staff's ID">

				<button type="submit">Delete</button>

			</form>
			<h5>
				<a href="/staffs/home">go to Staff's Home Page</a>
			</h5>
			<p></p>
			<h5>
				<a href="/home">go to Home Page</a>
			</h5>
		</div>
	</div>
</body>
</html>