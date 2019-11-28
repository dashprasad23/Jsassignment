<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#f1{
		border:1px solid black;
		height:259px;
		width:284px;
		margin-left:275px;
		margin-top:94px;
		padding-top:4px;
		padding-left:100px;
	}

</style>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<%

String id="";
Cookie[] cookies=request.getCookies();
if(cookies!=null)
{
	for(Cookie cookie:cookies)
	{
		if(cookie.getName().equals("alwaysRemember"))
		{
			id=cookie.getValue();
		}
	}
}


%>
<body>
<h4><%=msg %></h4>
<form id='f1' action='./login' method='post'>"
		<h2>Login hear</h2>
		<input type='text' name='id' placeholder="enter your id..." value="<%=id%>"><br><br>
		<input type='password' name='password' placeholder='enter your password...'><br><br>
		Remember me:<input type='checkbox' name='remember' value='check'><br><br>
		<input type='Submit' name='Submit' value='Login'><br><br>
		<a href="register.html">Register</a>
		</form>
</body>
</html>