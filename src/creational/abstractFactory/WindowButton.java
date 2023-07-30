package creational.abstractFactory;

public class WindowButton implements Button {

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("onClick event in Window button");
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println("Window button rendered");
	}

}
