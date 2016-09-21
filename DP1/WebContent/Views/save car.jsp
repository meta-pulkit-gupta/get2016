<%@page import="java.io.PrintWriter"%>
<%@page import="com.sun.org.apache.xerces.internal.impl.dv.ValidatedInfo"%>
<%@page import="com.VO.Car"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Car</title>
</head>
<body>
	<h1 style="margin-top: 100px;" align="center">Car Details</h1>
	<%		
			if(application.getAttribute("viewPage") != null && application.getAttribute("viewPage").equals("true")){ %>
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
			<script src="JS/ViewPage.js"></script>
	<%}
		Car car = (Car)application.getAttribute("car");
		String company = "";
		String model = "";
		String engineInCC = "";
		float fuelCapacity = 0.0F;
		float milage = 0.0F;
		int price = 0;
		float roadTax = 0.0f;
		String ac = "";
		String powerSteering = "";
		String accessoryKit = "";
		if(car != null){
			company = car.getCompany();
			model = car.getModel();
			engineInCC = ""+car.getEngineInCC();
			fuelCapacity = car.getFuelCapacity();
			milage = car.getMilage();
			price = car.getPrice();
			roadTax = car.getRoadTax();
			ac = car.getAc();
			powerSteering = car.getPowerSteering();
			accessoryKit = car.getAccessoryKit();
		}
	%>
	<form action="CarController" method="post">
		<table align="center" width="20%">
			<tr>
				<td><label for="company">Company</label></td>
				<td><input type="text" name="company" id="company" value="<%=company%>" required /></td>
			</tr>
			
			<tr>
				<td><label for="model">Model</label></td>
				<td><input type="text" name="model" id="model" value="<%=model%>" required /></td>
			</tr>

			<tr>
				<td><label for="engineInCC">Engine In CC</label></td>
				<td><input type="number" name="engineInCC" id="engineInCC" value=<%=engineInCC%>
					required /></td>
			</tr>

			<tr>
				<td><label for="fuelCapacity">Fuel Capacity</label></td>
				<td><input type="number" step=".01" name="fuelCapacity" id="fuelCapacity" value=<%=fuelCapacity%>
					required /></td>
			</tr>

			<tr>
				<td><label for="milage">Milage</label></td>
				<td><input type="number" step=".01" name="milage" id="milage" value=<%=milage%> required />
				</td>
			</tr>

			<tr>
				<td><label for="price">Price</label></td>
				<td><input type="number" name="price" id="price" value=<%=price%> required /></td>
			</tr>

			<tr>
				<td><label for="roadTax">Road Tax</label></td>
				<td><input type="text" step=".01" name="roadTax" id="roadTax" value=<%=roadTax%> required />
				</td>
			</tr>

			<tr>
				<td><label for="ac">AC</label></td>
				<td><select id="ac" name="ac" required>
						<option value="">Select</option>
						<option value="yes">Yes</option>
						<option value="no">No</option>
				</select></td>
			</tr>

			<tr>
				<td><label for="powerSteering">Power Steering</label></td>
				<td><select id="powerSteering" name="powerSteering" required>
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
	<% application.removeAttribute("viewPage");
	   application.removeAttribute("car");
	%>
</body>
</html>