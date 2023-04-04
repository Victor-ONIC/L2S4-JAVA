package mixedlist;

public class MixedList {
	MixedMaillon head;
	MixedMaillon current;
	
	public MixedList() {}
	
	public void ajout(Affichable o) {
		MixedMaillon m = new MixedMaillon(o);
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
	
	public void afficher() {
		MixedMaillon m = head;
		while (m != null) {
			m.data.afficher();
			m = m.next;
		}
	}
}
