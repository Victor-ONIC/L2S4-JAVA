package geom;

public class Circle extends GeomFig {
	static final double PI = 3.141592653589793;
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double perimeter() {
		return 2 * PI * radius;
	}
}
