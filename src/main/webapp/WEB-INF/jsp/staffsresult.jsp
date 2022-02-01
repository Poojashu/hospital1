<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Staff Details</title>
<link rel="stylesheet" href="/css/staffshome.css">
<style>
h6 {
	text-align: right;
}

table {
	background: white;
}

h2 {
	background: white;
}
.button{
	position: right;
	bottom: 30px;
}
</style>
</head>
<body>
	<div class="main">
		<h6>
			<a href="/login">LogOut</a>
		</h6>
		<%
		String driverName = "org.postgresql.Driver";
		String connectionUrl = "jdbc:postgresql://localhost:5432/";
		String dbName = "Sprint1";
		String userId = "postgres";
		String password = "admin";

		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		%>





		<table align="center" cellpadding="5" cellspacing="5" border="1">
			<h2 align = "center">
				<font><strong>All Staff Details</strong></font>
			</h2>
			<tr>
				<td><b>Staff ID</b></td>
				<td><b>Staff Name</b></td>
				<td><b>Staff Room</b></td>
				<td><b>Staff Mobile</b></td>
			</tr>
			<%
			try {
				connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
				statement = connection.createStatement();
				String sql = "SELECT * FROM staffmember";

				resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
			%>
			<tr color="black">

				<td><%=resultSet.getString("sid")%></td>
				<td><%=resultSet.getString("sname")%></td>
				<td><%=resultSet.getString("sroom")%></td>
				<td><%=resultSet.getString("smobile")%></td>
			</tr>

			<%
			}
			connection.close();
			} catch (Exception e) {
			e.printStackTrace();
			}
			%>
		</table>
		<a href="/staffs/home" class = "button">go Back</a>
	</div>
</body>
</html>