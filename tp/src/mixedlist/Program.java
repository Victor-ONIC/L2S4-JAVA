package mixedlist;

import listedepoints.Point;

public class Program {
	public static void main(String[] args) {
		// Tests de la classe MixedList.
		MixedList L = new MixedList();
		L.ajout(new Point(1, 2));
		L.ajout(new vector.Vector(4, 2, 0));
		
		L.afficher();
	}
}
