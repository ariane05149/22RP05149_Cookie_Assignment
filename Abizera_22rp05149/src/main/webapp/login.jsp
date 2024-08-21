<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login</h2>
<form action="Login_22rp05149" method-"post>
Username:<input type="text" name="username" required><br>
Password:<input type="password" name="password" required><br>
<input type="submit" value="login">


</form>
<%if(request.getAttribute("errorMessage")!= null){ %>
<p style="color:red;"><%request.getAttribute("errorMessage"); %></p>
<%} %>
</body>
</html>