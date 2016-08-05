package session6;

/**
 * Java bean class act as a blueprint for creating Employee objects.
 * 
 * @author Pulkit Gupta
 *
 */
public class Employee implements Comparable<Employee> {
	String empId; // EmpID
	String name; // Name
	String address; // Address

	public Employee(String empId, String name, String address) {
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmpID: " + empId + "  EmpName: " + name + "  EmpAddress: "
				+ address + "\n";
	}

	/**
	 * To compare object of employee on the basis of their empId.
	 */
	@Override
	public int compareTo(Employee o) {
		return this.empId.compareTo(o.empId);
	}

}
