package subscribers;

public class Subscriber {
	String name;
	String number;
	
	public Subscriber(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	// NB: de préférence, mettre des gettes/setters plutôt
	// que d'accéder directement aux attributs.
	// Même si c'est dans le même package !
}
