package geom;

public class Triangle extends Polygon {
	public Triangle(double a, double b, double c) {
		super(3);
		sides[0] = a;
		sides[1] = b;
		sides[2] = c;
	}
}
