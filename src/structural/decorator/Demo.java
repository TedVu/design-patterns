package structural.decorator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSourceInterface a = new ConcreteDataSource();

		DataSourceInterface b = new ConcreteEncryptionDecorator(a);

		DataSourceInterface c = new ConcreteCompressionDecorator(b);

		c.read();
		c.write("Some data");
	}

}
