package structural.decorator;

public class ConcreteCompressionDecorator extends AbstractDataSourceDecorator {
	public ConcreteCompressionDecorator(DataSourceInterface a) {
		// TODO Auto-generated constructor stub
		super.setDataSourceWrappee(a);
	}
	@Override
	public void write(String data) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Compression before writing!");
		super.getDataSourceWrappee().write("Some data");
	}

	@Override
	public String read() {
		// TODO Auto-generated method stub
		System.out.println("Compression before read!");
		super.getDataSourceWrappee().read();
		return "Compression before read!";
	}
}
