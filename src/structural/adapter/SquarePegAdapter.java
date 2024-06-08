package structural.adapter;

public class SquarePegAdapter implements RoundShape {
	
	private SquarePeg squarePeg;
	
	public SquarePegAdapter(SquarePeg squarePeg) {
		this.squarePeg = squarePeg;
	}

	@Override
	public int getRadius() {
		// TODO Auto-generated method stub
		return squarePeg.getWidth() * 2;
	}
	
}
