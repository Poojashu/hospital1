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
<title>All Patient Details</title>
<link rel="stylesheet" href="/css/pateintresult.css">
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

.button {
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




		<div class="inner">
			<table align="center" cellpadding="5" cellspacing="5" border="1">
				<h2 align="center">
					<font><strong>All Patient Details</strong></font>
				</h2>
				<tr>
					<td><b>Patient ID</b></td>
					<td><b>Patient Name</b></td>
					<td><b>Patient Room</b></td>
					<td><b>Patient Age</b></td>
					<td><b>Patient Gender</b></td>
					<td><b>Patient Surgery</b></td>
					<td><b>Patient Address</b></td>
					<td><b>Doctor ID</b></td>
					<td><b>Staff ID</b></td>
				</tr>
				<%
				try {
					connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
					statement = connection.createStatement();
					String sql = "SELECT * FROM patient";

					resultSet = statement.executeQuery(sql);
					while (resultSet.next()) {
				%>
				<tr color="black">

					<td><%=resultSet.getString("pid")%></td>
					<td><%=resultSet.getString("pname")%></td>
					<td><%=resultSet.getString("proom")%></td>
					<td><%=resultSet.getString("page")%></td>
					<td><%=resultSet.getString("pgender")%></td>
					<td><%=resultSet.getString("psurgery")%></td>
					<td><%=resultSet.getString("paddress")%></td>
					<td><%=resultSet.getString("did")%></td>
					<td><%=resultSet.getString("sid")%></td>

				</tr>

				<%
				}
				connection.close();
				} catch (Exception e) {
				e.printStackTrace();
				}
				%>
			</table>
		</div>
		<a href="/patient/home" class="button">go Back</a>
	</div>
</body>
</html>

