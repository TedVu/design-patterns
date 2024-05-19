package structural.decorator;

public class ConcreteEncryptionDecorator extends AbstractDataSourceDecorator {

	public ConcreteEncryptionDecorator(DataSourceInterface a) {
		// TODO Auto-generated constructor stub
		super.setDataSourceWrappee(a);
	}

	@Override
	public void write(String data) {
		// TODO Auto-generated method stub
		System.out.println("Encryption before writing!");
		super.getDataSourceWrappee().write("Some data");
	}

	@Override
	public String read() {
		// TODO Auto-generated method stub
		System.out.println("Encryption before read!");
		super.getDataSourceWrappee().read();
		return "Encryption before read!";
	}
}
