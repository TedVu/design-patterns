package creational.builder;

public interface Builder {

	House getResult();

	void buildRoof();

	void buildWalls();

	void buildGarden();

	void buildSwimmingPool();

	void buildGround();
}
