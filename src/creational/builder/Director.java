package creational.builder;

public class Director {

	private Builder builder;

	public void make(HouseType houseType) {
		if (houseType == HouseType.APARTMENT) {
			builder.buildRoof();
			builder.buildGround();
		} else if (houseType == HouseType.BUNGALOW) {
			builder.buildGarden();
			builder.buildRoof();
			builder.buildGround();
		} else if (houseType == HouseType.PRIVATEHOUSE) {
			builder.buildGarden();
			builder.buildRoof();
			builder.buildGround();
			builder.buildSwimmingPool();
		}
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
}
