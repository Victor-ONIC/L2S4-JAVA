package geom;

public class Polygon extends GeomFig {
	double[] sides;
	
	public Polygon(int sides) {
		this.sides = new double[sides];
	}
	
	public double perimeter() {
		double perimeter = 0;
		for (int i = 0; i < sides.length; i++) {
			perimeter += sides[i];
		}
		return perimeter;
	}
}
