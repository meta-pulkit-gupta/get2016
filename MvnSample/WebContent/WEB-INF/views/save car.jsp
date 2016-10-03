<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Car</title>
<script src="resources/jquery-3.0.0.min.js" ></script>
<script src="resources/angular.min.js" ></script>
<script src="resources/main.js" ></script>
</head>
<body ng-app="saveCar">
	<h1 style="margin-top: 100px;" align="center">Car Details</h1> 
	<form action="CarController" method="post" ng-controller="formController" ng-init="getCarInformation('${pageType}',${id})">
		<table align="center" width="20%">
			<tr>
				<td><label for="company">Company</label></td>
				<td><input type="text" name="company" id="company" value="{{car.company}}" required /></td>
			</tr>
			
			<tr>
				<td><label for="model">Model</label></td>
				<td><input type="text" name="model" id="model" value="{{car.model}}" required /></td>
			</tr>

			<tr>
				<td><label for="engineInCC">Engine In CC</label></td>
				<td><input type="number" name="engineInCC" id="engineInCC" value="{{car.engineInCC}}"
					required /></td>
			</tr>

			<tr>
				<td><label for="fuelCapacity">Fuel Capacity</label></td>
				<td><input type="number" step=".01" name="fuelCapacity" id="fuelCapacity" value="{{car.fuelCapacity}}"
					required /></td>
			</tr>

			<tr>
				<td><label for="milage">Milage</label></td>
				<td><input type="number" step=".01" name="milage" id="milage" value="{{car.milage}}" required />
				</td>
			</tr>

			<tr>
				<td><label for="price">Price</label></td>
				<td><input type="number" name="price" id="price" value="{{car.price}}" required /></td>
			</tr>

			<tr>
				<td><label for="roadTax">Road Tax</label></td>
				<td><input type="text" step=".01" name="roadTax" id="roadTax" value="{{car.roadTax}}" required />
				</td>
			</tr>

			<tr>
				<td><label for="ac">AC</label></td>
				<td><select id="ac" name="ac" data-ng-model="car.ac" required>
						<option value="">Select</option>
						<option value="yes">Yes</option>
						<option value="no">No</option>
				</select></td>
			</tr>

			<tr>
				<td><label for="powerSteering">Power Steering</label></td>
				<td><select id="powerSteering" name="powerSteering" data-ng-model="car.powerSteering" required>
						<option value="">Select</option>
						<option value="yes">Yes</option>
						<option value="no">No</option>
				</select></td>
			</tr>
			<tr>
				<td><label for="accessoryKit">Accessory Kit</label></td>
				<td><select id="accessoryKit" name="accessoryKit" required>
						<option value="">Select</option>
						<option value="yes">Yes</option>
						<option value="no">No</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="reset" /></td>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>