package vector;

public class Program {

	public static void main(String[] args) {
		// Tests de la classe Vector.
		Vector v1 = new Vector(1, 2, 3);
		Vector v2 = new Vector(4, 5, 6);
		
		v1.display();
		v2.display();
		
		v1.multiply(6);
		v1.display();
		
		System.out.println(v1.scalar(v2));
		
		System.out.println(v1.sum(v2));
		
		System.out.println("Nombre de vecteurs crées: " + Vector.getVectorCount());
		
		// Tests de la classe PairVect.
		PairVect paire = new PairVect(v1, v2);
		paire.first().display();
		paire.second().display();
		
		// Test de la fonction d'échange de vecteurs.
		Vector v3 = new Vector(1, 2, 3);
		Vector v4 = new Vector(4, 5, 6);
		
		v1.display();
		v2.display();
		
		Vector.swap(v3, v4);
		
		v1.display();
		v2.display();
	}
	
}
