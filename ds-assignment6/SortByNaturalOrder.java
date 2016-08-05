package session6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * To Sort the collection of Employee object by Natural order defined.
 * 
 * @author Pulkit Gupta
 *
 */

public class SortByNaturalOrder {
	
	HashMap<String, Employee> map;

	public SortByNaturalOrder() {
		map = new HashMap<String, Employee>();
	}
	
	/**
	 * To sort Employee list in natural order.
	 * @param employees
	 */

	public void naturalOrderSortingEmployee(List<Employee> employees) {
		Collections.sort(employees);
		printCollection(employees);
	}

	/**
	 * print the collection.
	 * 
	 * @param employees
	 *            objects of employee.
	 */

	public void printCollection(List<Employee> employees) {
		System.out.println("\n" + employees);
	}
	
	/**
	 * Take input from the user and according to that create object of Employees
	 * and add them.
	 * 
	 * @param sc
	 *            Scanner object for taking input.
	 */
	
	public void addEmployees(Scanner sc) {
		boolean flag = false;
		Employee employee;
		String empId;
		String name;
		String address;
		do {
			flag = false;
			System.out.println("Enter the Employee's Details :");
			System.out.print("Enter EmpID: ");
			empId = sc.nextLine() + "";
			System.out.println("Enter Name: ");
			name = sc.nextLine() + "";
			System.out.println("Enter Address: ");
			address = sc.nextLine() + "";
			employee = new Employee(empId, name, address); 
			 // create an object of employee with the given values.
			map.put(empId, employee);
			System.out.println("Do you want to Continue?[y/n]");
			if (sc.nextLine().equalsIgnoreCase("y")) {
				flag = true;
			}
		} while (flag);
		// Sort Employees by Employee's natural order.
		List<Employee> employees = new ArrayList<Employee>();
		Object[] keys = map.keySet().toArray();
		for (int i = 0; i < keys.length; i++) {
			employees.add(map.get(keys[i]));
		}
		naturalOrderSortingEmployee(employees);
		System.out.println("\nEnd");

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
		new SortByNaturalOrder().addEmployees(sc);
	}

}
