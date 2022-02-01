<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home Page</title>
<link rel="stylesheet" href="/css/userhome.css">
</head>
<body>
	<div class="main">
		<h6>
			<a href="/login">LogOut</a>
		</h6>
		<div class="inner">
			<h1>Welcome to the User Page...</h1>
			<a href="/doctor/userhome">Doctors' User Operations</a> 
			<br> 
			<a href="/staffs/userhome">Staffs' User Operations</a>
			<br> 
			<a href="/patient/userhome">Patients' User Operations</a>
			<br> 
			<a href="/room/userhome">Rooms' User Operations</a>	
			<br> 
			<a href="/charges/userhome">Surgeries' User Operations</a>
			<br>
			<a href="/join/userhome">Join Operations</a>
		</div>
	</div>
</body>
</html>