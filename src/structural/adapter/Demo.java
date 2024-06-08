package structural.adapter;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquarePeg sp = new SquarePeg(5);
		RoundShape spa = new SquarePegAdapter(sp);
		RoundShape roundPeg = new RoundPeg(5);

		System.out.println("Radius of round peg is " + roundPeg.getRadius());
		System.out.println("Radius of square peg after going through the adapter is " + spa.getRadius());
	}

}
