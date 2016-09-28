package com.util;

public class Queries {
	public static final String SAVE_EMPLOYEE = "INSERT INTO employee(id, name, city, experience, salary) VALUES (?,?,?,?,?);";
	public static final String GET_EMP_BY_ID = "SELECT * FROM employee WHERE id = ? ;";
	public static final String GET_EMPS_BY_NAME = "SELECT * FROM employee WHERE name = ? ;";
	public static final String GET_ALL_EMP = "SELECT * FROM employee;";
	public static final String DELETE_EMP_BY_ID = "DELETE FROM employee WHERE id = ? ;";
}
