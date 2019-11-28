<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
#f1 {
	border: 1px solid black;
	height: 259px;
	width: 284px;
	margin-left: 275px;
	margin-top: 94px;
	padding-top: 4px;
	padding-left: 100px;
}
</style>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<body>
<h4><%=msg %></h4>
	<form id="f1" action="./changepassword" method="post">
		<a href="./home">Home</a><br><br> 
		
		Name:<input type="password" name="newPassword" placeholder="Enter your new password"><br> <br>
		comform:<input type="password" name="conformPassword" placeholder="">
		<input type="submit" name="change" value="change">
		 <a href="./logout">Logout</a>


	</form>

</body>
</html>