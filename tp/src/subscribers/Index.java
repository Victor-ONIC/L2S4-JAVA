package subscribers;

public class Index {
	int maxSubs;
	int index;  // Position du prochain subscriber dans le tableau.
	Subscriber[] subs;
	
	public Index(int max) {
		maxSubs = max;
		index = 0;
		subs = new Subscriber[maxSubs];
	}
	
	public boolean addSubscriber(Subscriber sub) {
		if (index == maxSubs) return false;
		subs[index++] = sub;
		return true;
	}
	
	public String getNumber(String name) {
		for (int i = 0; i < subs.length; i++) {
			if (subs[i] != null && subs[i].name.equals(name)) {
				return subs[i].number;
			}
		}
		return null;
	}
	
	public int getNbSubscribers() {
		return subs.length;
	}
	
	public Subscriber getSubscriber(int i) {
		// On suppose que l'argument i=1 correspond à subs[1]
		// soit le deuxième subscriber.
		return subs[i];
	}
	
	public Subscriber[] getSortedSubscribers() {
		// Copier subs dans tab.
		Subscriber[] tab = new Subscriber[maxSubs];
		for (int i = 0; i < index; i++) {
			tab[i] = new Subscriber(subs[i].name, subs[i].number);
		}
		
		// Trier tab
		for (int i = 0; i < index; i++) {
			for (int j = 0; j < index - i - 1; j++) {
				if (tab[j].name.compareTo(tab[j+1].name) > 0) {
					Subscriber tmp = tab[j];
					tab[j] = tab[j+1];
					tab[j+1] = tmp;
				}
			}
		}
		return tab;
	}
	
	// TODO DELETE
	public void print() {
		for (int i = 0; i < index; i++) {
			System.out.println(subs[i].name);
			System.out.println(subs[i].number);
		}
	}
}
