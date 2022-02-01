<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Patient's Details</title>
<link rel="stylesheet" href="/css/patientadd.css">
</head>
<body>
	<div class="login-page">
		<h6>
			<a href="/login">LogOut</a>
		</h6>
		<div class="form">
			<div class="login">
				<div class="login-header">
					<p>Insert/Update Patient Details</p>
				</div>
			</div>

			<form class="login-form" method="post" action="add">
				<div class="forminner">
					<input type="number" name="pid" placeholder="Patient's ID">
					<input type="text" name="pname" placeholder="Patient's Name">
					<input type="number" name="proom" placeholder="Patient's Room Number">
					<input type="number" name="page" placeholder="Patient's Age"> 
					<input type="text" name="pgender" placeholder="Patient's Gender">
					<input type="text" name="psurgery" placeholder="Patient's Surgery">
					<input type="text" name="paddress" placeholder="Patient's Address">
					<input type="number" name="did" placeholder="Patient's Doctor's ID">
					<input type="number" name="sid" placeholder="Patient's Staff's ID">
					<button type="submit">Submit</button>
				</div>
			</form>


			<h5>
				<a href="/patient/home">go to Patient's Home Page</a>
			</h5>
			<p></p>
			<h5>
				<a href="/home">go to Home Page</a>
			</h5>
		</div>
	</div>
</body>
</html>