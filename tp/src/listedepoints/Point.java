package listedepoints;

public class Point {
	double x, y;
	
	public Point() {}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void afficher() {
		System.out.println("(" + x + "," + y + ")");
	}
}
