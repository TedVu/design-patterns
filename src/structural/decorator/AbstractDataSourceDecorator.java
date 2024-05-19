package structural.decorator;

public abstract class AbstractDataSourceDecorator implements DataSourceInterface {

	private DataSourceInterface dataSourceWrappee;

	public abstract String read();

	public abstract void write(String data);

	public DataSourceInterface getDataSourceWrappee() {
		return dataSourceWrappee;
	}

	public void setDataSourceWrappee(DataSourceInterface dataSourceWrappee) {
		this.dataSourceWrappee = dataSourceWrappee;
	}

}
