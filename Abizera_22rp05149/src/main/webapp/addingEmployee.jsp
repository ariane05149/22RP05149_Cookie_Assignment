<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddEmployee</title>
</head>
<body>
<h2>Add Employee</h2>
<form action="AddingnewEmp" method="post">
Name:<input type="text" name="name" required><br>
Email:<input type="email" name="email" required><br>
position:<input type="text" name="position" required><br>
Department:<input type="text" name="Department" required><br>
phone:<input type="number" name="phone" required><br><br>

<input type ="submit" value"="Add Employee">
<% if (request.getAttribute("errorMessage") != null) { %>
  <p style="color:red;"><%= request.getAttribute("errorMessage") %></p>
<% } %>
  
</form>
</body>
</html>