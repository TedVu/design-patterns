package creational.singleton;

public class Demo {

	public static void main(String[] args) {
		/*
		 * Singleton design pattern makes sure that a class should have a single
		 * instance that is accessible to all clients.
		 * 
		 */
		Database db = Database.getSingletonInstance();
		System.out.println(db.toString());
	}
}
