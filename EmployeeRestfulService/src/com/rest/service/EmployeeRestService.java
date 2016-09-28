package com.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.DAO.EmployeeDAO;
import com.bean.Employee;

@Path("Employee")
public class EmployeeRestService {

	@POST
	@Path("/insertEmployee")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertEmployee(Employee employee) {
		boolean result = new EmployeeDAO().createEmployee(employee);
		if (result) {
			return "Employee details successfully inserted!!";
		} else {
			return "Employee not inserted!!";
		}
	}

	@GET
	@Path("/getEmployeeByID")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeByID(@QueryParam("id") int id) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new EmployeeDAO().getEmployeeByID(id));
		GenericEntity<List<Employee>> generic = new GenericEntity<List<Employee>>(
				emp) {
		};
		return Response.ok(generic).build();
	}

	@GET
	@Path("/getEmployeesByName")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeesByName(@QueryParam("name") String name) {
		List<Employee> emp = new EmployeeDAO().getEmployeesByName(name);
		GenericEntity<List<Employee>> generic = new GenericEntity<List<Employee>>(
				emp) {
		};
		return Response.ok(generic).build();
	}

	@GET
	@Path("/getAllEmployees")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllEmployees() {
		List<Employee> emp = new EmployeeDAO().getAllEmployees();
		GenericEntity<List<Employee>> generic = new GenericEntity<List<Employee>>(
				emp) {
		};
		return Response.ok(generic).build();
	}

	@DELETE
	@Path("/deleteEmployeesByID")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteEmployeesByID(@QueryParam("id") int id) {
		boolean result = new EmployeeDAO().deleteEmployeeByID(id);
		if (result) {
			return "Employee record deleted successfully";
		} else {
			return "Employee record not found";
		}
	}
}
