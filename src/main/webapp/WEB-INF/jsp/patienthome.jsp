<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page for Patient Details</title>
<link rel="stylesheet" href="/css/staffshome.css">
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
			<a href="/patient/add">Click to Insert/Update</a> 
			<br> 
			<a href="/patient/delete">Click to Delete</a> 
			<br> 
			<a href="/patient/all">View All Patient Details</a>
		</div>

		<a class="home" href="/home">go to Home Page</a>

	</div>
</body>
</html>