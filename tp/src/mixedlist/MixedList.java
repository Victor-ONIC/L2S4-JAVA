package mixedlist;

import java.util.Vector;
import listedepoints.Point;

public class MixedList {
	MixedMaillon head;
	MixedMaillon current;
	
	public MixedList() {}
	
	public void ajout(Object o) {
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
			String t = m.data.getClass().getName();
			System.out.println(t);
			
			if (t == "java.util.Vector") {
				Vector<Point> v = (Vector<Point>)m.data;
				for (int i = 0; i < v.size(); i++) {
					v.get(i).afficher();
				}
			} else if (t == "listedepoints.Point") {
				Point p = (Point)m.data;
				p.afficher();
			}
			m = m.next;
		}
	}
}
