package structural.composite;

public abstract class EmployeeAbstractClass implements EmployeeInterface {

	private String name;
	private int salary;

	public EmployeeAbstractClass(String name, int salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
