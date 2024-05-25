package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements EmployeeInterface {

	private String name;
	private int salary;
	private List<EmployeeInterface> employees = new ArrayList<>();

	public Manager(List<EmployeeInterface> employees) {
		for (EmployeeInterface e : employees) {
			this.employees.add(e);
		}
	}

	public Manager(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int calculateSalary() {
		int salary = this.salary;
		for (EmployeeInterface e : employees) {
			salary += e.calculateSalary();
		}
		return salary;
	}

	@Override
	public void printName() {
		System.out.println("Manager name is " + this.name);
		for (EmployeeInterface e : employees) {
			e.printName();
		}
	}

	public void addEmployee(EmployeeInterface e) {
		employees.add(e);
	}
}
