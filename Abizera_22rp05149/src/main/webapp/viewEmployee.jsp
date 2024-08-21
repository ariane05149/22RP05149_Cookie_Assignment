<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee LIst</h2>
<table border="1">
<tr>
<th>ID</th>
<td>${employee.id }</td>
<table border="1">
<tr>
<th>Name</th>
<td>${employee.name }</td>
</tr>
<tr>
<th>position</th>
<td>${employee.position }</td>
</tr>
<tr>
<th>Department</th>
<td>${employee.Department }</td>
</tr>
</table>
<br>
<a href="EmployeeServlet?action=list"></a>

