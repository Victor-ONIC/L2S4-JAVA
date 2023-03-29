package listedepoints;

public class Program {
	public static void main(String[] args) {
		// Tests de l'exercice 2.
		ListeDePoints L = new ListeDePoints();
		L.ajout(new Point(1, 2));
		L.ajout(new Point(3, 4));
		L.ajout(new Point(5, 6));
		
		L.afficher();
	}
}
