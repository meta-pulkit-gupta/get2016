package session6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * To Sort the collection of Employee object by EmployeeName.
 * 
 * @author Pulkit Gupta
 *
 */
public class SortByEmployeeName {

	HashMap<String, Employee> map;

	public SortByEmployeeName() {
		map = new HashMap<String, Employee>();
	}

	/**
	 * NameComparator class to compare the employee objects via there name.
	 * 
	 * @author Pulkit Gupta
	 *
	 */
	private static class NameComparator implements Comparator<Employee> {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
		}
	}

	/**
	 * SortByName the list of Employees.
	 * 
	 * @param employees
	 *            objects of employee.
	 */
	public void sortByName(List<Employee> employees) {
		Collections.sort(employees, new NameComparator());
		printCollection(employees);
	}

	/**
	 * print the collection.
	 * 
	 * @param employees
	 *            objects of employee.
	 */

	public void printCollection(List<Employee> employees) {
		System.out.println(employees);
	}

	/**
	 * Take input from the user and according to that create object of Employees and add them.
	 * @param sc Scanner object for taking input.
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
			employee = new Employee(empId, name, address); // create an object
															// of employee with
															// the given values.
			map.put(empId, employee);
			System.out.println("Do you want to Continue?[y/n]");
			if (sc.nextLine().equalsIgnoreCase("y")) {
				flag = true;
			}
		} while (flag);

		// Sort Employees by Employee name.
		List<Employee> employees = new ArrayList<Employee>();
		Object[] keys = map.keySet().toArray();
		for (int i = 0; i < keys.length; i++) {
			employees.add(map.get(keys[i]));
		}
		sortByName(employees);
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
	 * launch the programme.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new SortByEmployeeName().addEmployees(sc);
	}
}
