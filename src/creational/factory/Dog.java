package creational.factory;

public class Dog implements Pet {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Dog is drinking");
	}

	@Override
	public void waitForPet() {
		// TODO Auto-generated method stub
		System.out.println("Dog is waiting for pet");
	}

}
