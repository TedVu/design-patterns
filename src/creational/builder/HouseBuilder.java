package creational.builder;

public class HouseBuilder implements Builder {

	private House house = null;

	public void initHouse() {
		if (house == null) {
			house = new House();
		}
	}

	public House getResult() {
		return this.house;
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		initHouse();
		System.out.println("Building a house roof");
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		initHouse();
		System.out.println("Building house's walls");
	}

	@Override
	public void buildGarden() {
		// TODO Auto-generated method stub
		initHouse();
		System.out.println("Building a house's garden");
	}

	@Override
	public void buildSwimmingPool() {
		// TODO Auto-generated method stub
		initHouse();
		System.out.println("Building a house's swimming pool");

	}

	@Override
	public void buildGround() {
		// TODO Auto-generated method stub
		initHouse();
		System.out.println("Building a house's ground floor");
	}

}
