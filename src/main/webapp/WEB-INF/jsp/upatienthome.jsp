<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home Page for Patient Details</title>
<link rel="stylesheet" href="/css/udoctorhome.css">
<style>
	h1{
		font-size: 2rem;
		
	}
</style>
</head>
<body>
	<div class="main">
		<h6>
			<a href="/login">LogOut</a>
		</h6>
		<div class="inner">
			<h1>PATIENT DETAILS</h1>
			<a href="/patient/userfindbyid">Click to Search by ID</a>
			<br> 
			<a href="/patient/userfindbyname">Click to Search by Name</a>
			<br> 
			<a href="/patient/all2">View All Patient Details</a>
		</div>
		
		<a class="home" href="/userhome">go to User Home Page</a>
	</div>
</body>
</html>