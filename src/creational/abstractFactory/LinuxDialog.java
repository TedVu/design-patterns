package creational.abstractFactory;

public class LinuxDialog implements Dialog {

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println("Linux dialog rendered");
	}

	@Override
	public void showMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("Linux dialog shows a %s".formatted(message));
	}
}
