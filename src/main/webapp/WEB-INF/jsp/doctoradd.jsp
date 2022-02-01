<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Doctor's Details</title>
<link rel="stylesheet" href="/css/doctoradd.css">
</head>
<body>
	<div class="login-page">
		<h6>
			<a href="/login">LogOut</a>
		</h6>
		<div class="form">
			<div class="login">
				<div class="login-header">
					<p>Insert/Update Doctor Data</p>
				</div>
			</div>
			<form class="login-form" method="post" action="add">
				<input type="number" name="did" placeholder="Doctor's ID">
				<input type="text" name="dname" placeholder="Doctor's Name">
				<input type="text" name="daddress" placeholder="Doctor's Address">
				<input type="text" name="dmobile" placeholder="Doctor's Mobile Number">
				<input type="text" name="dspecialization" placeholder="Doctor's Specialization">
				<button type="submit">Submit</button>

			</form>
			<h5>
				<a href="/doctor/home">go to Doctor's Home Page</a>
			</h5>
			<p></p>
			<h5>
				<a href="/home">go to Home Page</a>
			</h5>
		</div>
	</div>

</body>
</html>