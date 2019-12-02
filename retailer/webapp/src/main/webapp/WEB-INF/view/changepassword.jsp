<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Change Password</legend>
		<form action="./changepassword" method="post">
			<table>
				<tr>
					<td><a href="./home"> Home </a></td>
				</tr>
				<tr>
					<td><a href="./logout" style="float: right;">Logout</a> </td> 
				</tr>
				<tr>
				<td> New password : </td>
					<td><input type="password" name="password"> </td>
				</tr>
				<tr>
					<td> Confirm password : </td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					<td><input type="submit" name="Change"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>