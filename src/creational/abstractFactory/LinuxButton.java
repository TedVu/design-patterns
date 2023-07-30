package creational.abstractFactory;

public class LinuxButton implements Button {

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("onClick event in Linux button");
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println("Linux button rendered");
	}

}
