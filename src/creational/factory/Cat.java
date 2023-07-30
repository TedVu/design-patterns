package creational.factory;

public class Cat implements Pet {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat is eating");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Cat is drinking");
	}

	@Override
	public void waitForPet() {
		// TODO Auto-generated method stub
		System.out.println("Cat is waiting for pet");
	}

}
