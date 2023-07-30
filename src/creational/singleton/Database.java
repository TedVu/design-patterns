package creational.singleton;

public class Database {

	private static Database db;

	private Database() {

	}

	public static Database getSingletonInstance() {
		if (db == null) {
			db = new Database();
		}

		return db;
	}

	public String toString() {
		return String.format("This is the single database instance");
	}
}
