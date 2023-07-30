package creational.abstractFactory;

public class WindowDialog implements Dialog {

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println("Window dialog rendered");
	}

	@Override
	public void showMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("Window dialog shows a %s".formatted(message));
	}
}
