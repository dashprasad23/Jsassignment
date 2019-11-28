<%@page import="com.tyss.empwebapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
   EmployeeInfo info=(EmployeeInfo)request.getAttribute("info");
        

%>

<body>
<a href="/home">Home</a>
<a href="/logout">Logout</a>
<%if(info!=null){ %>
<fieldset>
	<table border='1px solid black'>
		<tr>
			<th>ID</th>
			<th>name</th>
			<th>email</th>
		</tr>
		<tr>
			<td><%=info.getId() %></td>
			<td><%=info.getName() %></td>
			<td><%=info.getEmail() %></td>
		</tr>
	</table>
	</fieldset>
	
	<%}else{%>
	<h1>No data found</h1>
	<%} %>

</body>
</html>