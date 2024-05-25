package structural.composite;

public class Employee extends EmployeeAbstractClass {

	public Employee(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return this.getSalary();
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println(this.getName());
	}

}
