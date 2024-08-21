<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    if(session.getAttribute("username")== null){
    	response.sendRedirect("login.jsp");
    	return;
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EM DASHBOARD</title>
</head>
<body>
<h1>Welcome to the EM dashboard</h1>
<div class="nav">
<a href="addEmployee.jsp">Add Employee</a>
<a href>"employeeList.jsp">View Employee</a>
<a href>"logout.jsp">logout</a>
</div>
<div class ="welcome">

Hello,<%=session.getAttribute("username") %>! you are logged in as <%=

session.getAttribute("role")%>

</div>
<p>this is your dashboard where you can manage employee record.</p>
</body>
</html>