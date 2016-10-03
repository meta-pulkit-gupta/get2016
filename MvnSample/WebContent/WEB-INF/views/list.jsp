<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
<script src="resources/jquery-3.0.0.min.js" ></script>
<script src="resources/angular.min.js" ></script>
<script src="resources/main.js" ></script>
</head>
<body>
<h1 align="center">List of Vehicles</h1>
<table style="margin-left: 150px" width="60%" border="1px" ng-app="listCars" ng-controller="carController" ng-init="carLoad()">
	<tr>
		<th>Company</th>
		<th>Model</th>
		<th>Edit</th>
		<th>View</th>
	</tr>
		<tr ng-repeat="car in cars" >
			<td>{{car.company}}</td>
			<td>{{car.model}}</td>
			<td>
				<a href="updatecar?id={{car.id}}">Edit</a>
			</td>
			<td>
				<a href="viewcar?id={{car.id}}">View</a>
			</td>
		</tr>
</table>
</body>
</html>
