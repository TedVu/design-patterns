package structural.decorator;

public class ConcreteDataSource implements DataSourceInterface {

	@Override
	public String read() {
		// TODO Auto-generated method stub
		System.out.println("Reading from concrete data source");
		return "Reading from concrete data source";
	}

	@Override
	public void write(String data) {
		// TODO Auto-generated method stub
		System.out.println("Writing from concrete data source");
	}

}
