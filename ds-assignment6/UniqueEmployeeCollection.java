package session6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Collection of Unique Employee object.
 * 
 * @author Pulkit Gupta
 *
 */

public class UniqueEmployeeCollection {
	HashMap<String, Employee> map;

	public UniqueEmployeeCollection() {
		map = new HashMap<String, Employee>();
	}
	
	/**
	 * Take input from the user and according to that create object of Employees
	 * and add them.
	 * 
	 * @param sc
	 *            Scanner object for taking input.
	 */

	public void addEmployee(List<Employee> employees) {
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			map.put(emp.getEmpId(), emp);
		}
		printCollection();
	}

	public void printCollection() {
		Object[] keys = map.keySet().toArray();
		for (int i = 0; i < keys.length; i++) {
			System.out.println(map.get(keys[i]));
		}
	}
	
	/**
	 * Take input from the user and according to that create object of Employees
	 * and add them.
	 * 
	 * @param sc
	 *            Scanner object for taking input.
	 */
	
	public void addEmployees(Scanner sc) {
		List<Employee> employees = new ArrayList<Employee>();
		boolean flag = false;
		Employee employee;
		String empId;
		String name;
		String address;
		do {
			System.out.println("Enter the Employee's Details :");
			System.out.print("Enter EmpID: ");
			empId = sc.nextLine() + "";
			System.out.println("Enter Name: ");
			name = sc.nextLine() + "";
			System.out.println("Enter Address: ");
			address = sc.nextLine() + "";
			employee = new Employee(empId, name, address);  
			// create an object of employee with the given values.
			employees.add(employee);
			System.out.println("Do you want to Continue?[y/n]");
			if (sc.nextLine().equalsIgnoreCase("y")) {
				flag = true;
			}
		} while (flag);
		// Sort Employees by Employee name.
		addEmployee(employees);
		System.out.println("End");

		/*
		 * employees.add(new Employee("z/16f", "uulkit", "Sumer nagar"));
		 * employees.add(new Employee("z/15e", "tulkit", "tumer nagar"));
		 * employees.add(new Employee("z/14d", "sulkit", "yumer nagar"));
		 * employees.add(new Employee("z/13c", "aulkit", "uumer nagar"));
		 * employees.add(new Employee("z/12b", "bulkit", "gumer nagar"));
		 * employees.add(new Employee("z/11a", "culkit", "humer nagar"));
		 */
	}

	/**
	 * Launch the programme.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new UniqueEmployeeCollection().addEmployees(sc);
	}
}
