<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login!!</title>
<link rel="stylesheet" href="/css/loginpage.css">
</head>
<body>
	<div class="login-page">
		<div class="form">
			<div class="login">
				<div class="login-header">
					<h3>${errormsg}</h3>
					<h3>LOGIN</h3>
					<p>Please enter your credentials to Log In</p>
				</div>
			</div>
			<form class="login-form" method="post">
				<input type="text" name="userid" placeholder="User ID" /> <input
					type="password" name="password" placeholder="Password" />
				<button>login</button>
				<p class="message">
					Not admin? <a href="/useridp">Sign in as a User</a>
				</p>
			</form>
		</div>
	</div>
</body>
</html>