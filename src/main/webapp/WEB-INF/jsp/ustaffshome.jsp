<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home Page for Staff Details</title>
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
			<h1>STAFF DETAILS</h1>
			<a href="/staffs/userfindbyid">Click to Search by ID</a>
			<br> 
			<a href="/staffs/userfindbyname">Click to Search by Name</a>
			<br> 
			<a href="/staffs/all2">Click to View All Staff Details</a>
		</div>
		
		<a class="home" href="/userhome">go to User Home Page</a>
	</div>
</body>
</html>