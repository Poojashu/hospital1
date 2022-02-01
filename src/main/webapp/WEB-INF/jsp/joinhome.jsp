<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page for Join Operations</title>
<link rel="stylesheet" href="/css/joinhome.css">
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
			<h1>JOIN OPERATIONS</h1>
			<a href="/join/joindp">Search for Patients by Doctor ID</a>
			<br> 
			<a href="/join/joinsp">Search for Patients by Staffs ID</a>
			<br> 
			<a href="/join/joinrp">Search for Patients by Room Number</a>
			<br>
			<a href="/join/joincp">Search for Patients by Surgery Name</a>
		</div>
		
		<a class="home" href="/userhome">go to User Home Page</a>
	</div>
</body>
</html>