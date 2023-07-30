package creational.factory;

public class Demo {
	public static void main(String[] args) {
		// Separate object construction code from where it is actually used (here)
		// hence we can extend the object construction code easily
		Pet cat = PetFactory.createAnimal(PetType.CAT);
		cat.eat();
	}

}
