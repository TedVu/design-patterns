package creational.builder;

/*
 * The interface that defines the steps to build houses
 * there are many combination as well but it's up to the client 
 * to implement it or not, probably can enhance with AbstractedHouseBuilder
 * 
 */
public interface Builder {

	House getResult();

	void buildRoof();

	void buildWalls();

	void buildGarden();

	void buildSwimmingPool();

	void buildGround();
}
