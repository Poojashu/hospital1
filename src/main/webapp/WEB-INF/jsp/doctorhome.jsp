<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page for Doctor Details</title>
<link rel="stylesheet" href="/css/doctorhome.css">
<style>
	h2{
		font-size: 2rem;
		color: white;
	}
</style>
</head>
<body>
	<div class="main">
		<h6>
			<a href="/login">LogOut</a>
		</h6>
		<div class="inner">
			<h2>DOCTOR OPERATIONS</h2>
			<a href="/doctor/add">Click to Insert/Update</a> <br> <a
				href="/doctor/delete">Click to Delete</a> <br> <a
				href="/doctor/all">View All Doctor Details</a>
		</div>
		<a class="home" href="/home">go to Home Page</a>
	</div>
</body>
</html>