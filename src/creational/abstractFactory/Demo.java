package creational.abstractFactory;

public class Demo {

	public static void main(String[] args) {
		AbstractGUIFactory guiFactory = new WindowGUIFactory();
		
		Button windowButton = guiFactory.createButton();
		windowButton.render();
		windowButton.onClick();
	}
}
