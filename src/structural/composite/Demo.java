package structural.composite;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInterface e1 = new Employee("Ted", 105000);
		EmployeeInterface e2 = new Employee("Kevin", 120000);
		EmployeeInterface e3 = new Employee("Mia", 130000);

		Manager m = new Manager("Manager", 100000);

		m.addEmployee(e1);
		m.addEmployee(e2);
		m.addEmployee(e3);

		m.printName();
		System.out.println("Salary of the team is " + m.calculateSalary());
	}

}
