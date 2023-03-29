package subscribers;

public class Program {
	public static void main(String[] args) {
		// Tests de la classe Index.
		Index carnet = new Index(5);
		carnet.addSubscriber(new Subscriber("Victor", "0786978148"));
		carnet.addSubscriber(new Subscriber("Marc", "0610188016"));
		carnet.addSubscriber(new Subscriber("Matthieu", "0782236855"));
		carnet.addSubscriber(new Subscriber("Gérard", "0680593388"));
		carnet.addSubscriber(new Subscriber("Suchada", "0681137710"));
		
		System.out.println("Numéro de Matthieu: " + carnet.getNumber("Matthieu"));

		System.out.println("Nombre d'abonnés: " + carnet.getNbSubscribers());
		
		System.out.print("Nom du premier abonné: ");
		System.out.println(carnet.getSubscriber(0).name);
		
		Subscriber[] arraySubs = carnet.getSortedSubscribers();
		System.out.println("\nTrié: ");
		for (int i = 0; i < 5; i++) {
			System.out.println(arraySubs[i].name);
			System.out.println(arraySubs[i].number);
		}
		System.out.println("\nRef: ");
		carnet.print();
	}
}
