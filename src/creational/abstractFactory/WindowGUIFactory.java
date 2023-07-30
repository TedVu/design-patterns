package creational.abstractFactory;

public class WindowGUIFactory extends AbstractGUIFactory {
	
	@Override
	public Button createButton() {
		return new WindowButton();
	}
	
	@Override
	public Dialog createDialog() {
		return new WindowDialog();
	}
}
