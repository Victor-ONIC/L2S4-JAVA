package listedepoints;

import liste.Liste;

public class ListeDePoints extends Liste {

	public ListeDePoints() {
		super();
	}
	
	public void afficher() {
		initialiser();
		while (!fin()) {
			Point p = (Point)information();
			System.out.println("(" + p.x + "," + p.y + ")");
			suivante();
		}
	}
	
}
