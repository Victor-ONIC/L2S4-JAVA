package mixedlist;

import java.util.Vector;
import listedepoints.Point;

public class Program {
	public static void main(String[] args) {
		// Tests de la classe MixedList.
		System.out.println("Hello World !");
		
		MixedList L = new MixedList();
		
		L.ajout(new Point(1, 2));
		
		Vector<Point> v = new Vector<>();
		v.add(new Point(9, 9));
		v.add(new Point(6, 6));
		L.ajout(v);
		
		L.afficher();
	}
}
