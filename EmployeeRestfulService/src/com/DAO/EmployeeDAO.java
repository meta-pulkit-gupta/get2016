package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;
import com.util.Connector;
import com.util.Queries;

public class EmployeeDAO {

	public boolean createEmployee(Employee emp) {
		Connection connection = Connector.getConnection();
		int numberOfRowUpdated = 0;
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(Queries.SAVE_EMPLOYEE);
			preparedStatement.setInt(1, emp.getId());
			preparedStatement.setString(2, emp.getName());
			preparedStatement.setString(3, emp.getCity());
			preparedStatement.setFloat(4, emp.getExperience());
			preparedStatement.setInt(5, emp.getSalary());
			numberOfRowUpdated = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Something went wrong!!");
		}
		return numberOfRowUpdated == 0 ? false : true;
	}

	public Employee getEmployeeByID(int id) {
		Connection connection = Connector.getConnection();
		Employee emp = null;
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(Queries.GET_EMP_BY_ID);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				emp = new Employee(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getFloat(4), rs.getInt(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}

	public List<Employee> getEmployeesByName(String name) {
		Connection connection = Connector.getConnection();
		List<Employee> emp = new ArrayList<Employee>();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(Queries.GET_EMPS_BY_NAME);
			preparedStatement.setString(1, name);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				emp.add(new Employee(rs.getInt(1), rs.getString(2), rs
						.getString(3), rs.getFloat(4), rs.getInt(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}

	public List<Employee> getAllEmployees() {
		Connection connection = Connector.getConnection();
		List<Employee> emp = new ArrayList<Employee>();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(Queries.GET_ALL_EMP);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				emp.add(new Employee(rs.getInt(1), rs.getString(2), rs
						.getString(3), rs.getFloat(4), rs.getInt(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}

	public boolean deleteEmployeeByID(int id) {
		Connection connection = Connector.getConnection();
		int result = 0;
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(Queries.DELETE_EMP_BY_ID);
			preparedStatement.setInt(1, id);
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == 0) {
			return false;
		} else {
			return true;
		}

	}
}
