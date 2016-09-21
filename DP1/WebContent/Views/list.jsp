<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
</head>
<body>
<%@ page import="java.util.List, com.VO.Car, java.util.ArrayList" %>
<h1 align="center">List of Vehicles</h1>
<table style="margin-left: 150px" width="60%" border="1px">
	<tr>
		<th>Company</th>
		<th>Model</th>
		<th>Edit</th>
		<th>View</th>
	</tr>
	<% List<Car> cars = (ArrayList<Car>)application.getAttribute("cars");
		Iterator itr = cars.iterator();
	%>
	<% for(Car car: cars){%>
		<tr>
			<td>
				<%=car.getCompany()%>
			</td>
			<td><%=car.getModel()%></td>
			<td>
				<a href="EditController?id=<%=car.getId() %>">Edit</a>
			</td>
			<td>
				<a href="ViewController?id=<%=car.getId() %>">View</a>
			</td>
		</tr>	
	<%}
	%>
</table>
</body>
</html>