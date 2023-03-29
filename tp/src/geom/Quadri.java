package geom;

public class Quadri extends Polygon {
	public Quadri(double a, double  b, double c, double d) {
		super(4);
		sides[0] = a;
		sides[1] = b;
		sides[2] = c;
		sides[3] = d;
	}
}
