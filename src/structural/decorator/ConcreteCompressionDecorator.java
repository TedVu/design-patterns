package structural.decorator;

public class ConcreteCompressionDecorator extends AbstractDataSourceDecorator {
	public ConcreteCompressionDecorator(DataSourceInterface a) {
		// TODO Auto-generated constructor stub
		super.setDataSourceWrappee(a);
	}

	@Override
	public void write(String data) {
		// TODO Auto-generated method stub
		super.getDataSourceWrappee().write("Some data");
		System.out.println("Compression after writing!");
	}

	@Override
	public String read() {
		// TODO Auto-generated method stub
		super.getDataSourceWrappee().read();
		System.out.println("Compression after read!");
		return "Compression before read!";
	}
}
