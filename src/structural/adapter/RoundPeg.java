package structural.adapter;

public class RoundPeg implements RoundShape {

	private int radius;

	public RoundPeg(int radius) {
		this.radius = radius;
	}

	@Override
	public int getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}

}
