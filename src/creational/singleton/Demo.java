package creational.singleton;

public class Demo {

	public static void main(String[] args) {
		Database db = Database.getSingletonInstance();
		System.out.println(db.toString());
	}
}
