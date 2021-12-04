<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
	<h1 class="text-center">${header_ }</h1>
	<h5 class="text-center">${desc }</h5>
	<h2>
		Hi ${user.userName }! <br> Please verify your email :
		${user.email }
	</h2>
</body>
</html>