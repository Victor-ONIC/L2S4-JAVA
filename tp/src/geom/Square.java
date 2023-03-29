package geom;

public class Square extends Rectangle {
	public Square(double side) {
		super(side, side);
	}
	
	public double perimeter() {
		return 4 * sides[0];
	}
}
