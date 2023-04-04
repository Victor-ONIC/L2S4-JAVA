package listedepoints;

import mixedlist.Affichable;

public class Point implements Affichable {
	double x, y;
	
	public Point() {}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void afficher() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("(" + x + "," + y + ")");
	}
}
