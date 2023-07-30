package creational.factory;

public class PetFactory {

	public static Pet createAnimal(PetType petType) {
		Pet pet = null;
		switch (petType) {
		case DOG:
			// we can reuse the object from a pool here!
			pet = new Dog();
			break;
		case CAT:
			pet = new Cat();
			break;
		default:
			throw new IllegalArgumentException("Pet type not supported");
		}
		return pet;
	}

}
