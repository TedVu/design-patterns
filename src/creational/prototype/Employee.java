package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

	private String employeeName;
	private List<String> employeeList;

	public Employee(String employeeName) {
		this.employeeName = employeeName;
	}

	public void addEmployee(String employeeName) {
		if (employeeList == null) {
			employeeList = new ArrayList<>();
		}

		employeeList.add(employeeName);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// Support deep clone
		Employee newEmployee = new Employee(this.employeeName);

		for (String employeeName : employeeList) {
			newEmployee.addEmployee(employeeName);
		}

		return newEmployee;
	}
}
