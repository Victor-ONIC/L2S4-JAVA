package liste;

public class Liste {
	Maillon head;
	Maillon current;
	
	public Liste() {}
	
	public void ajout(Object o) {
		Maillon m = new Maillon(o);
		m.next = head;
		head = m;
	}
	
	public void initialiser() {
		current = head;
	}
	
	public void suivante() {
		current = current.next;
	}
	
	public Object information() {
		return current.data;
	}
	
	public boolean fin() {
		return current == null;
	}
}
