package creational.builder;

public class Demo {

	public static void main(String[] args) {
		Builder houseBuilder = new HouseBuilder();
		Director d = new Director();
		d.setBuilder(houseBuilder);
		d.make(HouseType.PRIVATEHOUSE);
		House privateHouse = houseBuilder.getResult();
		System.out.println("The built house is %s".formatted(privateHouse.toString()));
	}

}
