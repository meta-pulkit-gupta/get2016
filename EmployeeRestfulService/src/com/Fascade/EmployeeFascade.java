package com.Fascade;

import java.util.List;

import com.DAO.EmployeeDAO;
import com.bean.Employee;

public class EmployeeFascade {
	
	
	public boolean createEmployee(Employee emp){
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.createEmployee(emp);
	}
	
	public Employee getEmployeeByID(int id){
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.getEmployeeByID(id);
	}
	
	public List<Employee> getEmployeesByName(String name){
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.getEmployeesByName(name);
	}
	
	public List<Employee> getAllEmployees(){
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.getAllEmployees();
	}
	
	public boolean deleteEmployeeByID(int id){
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.deleteEmployeeByID(id);
	}
}
