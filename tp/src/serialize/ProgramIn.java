package serialize;

import java.util.Vector;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ProgramIn {
	public static void main(String[] args) {
		try {
			
			FileInputStream output = new FileInputStream("C:\\Users\\victo\\Desktop\\Dossier_Principal\\UNI\\COURS\\L2S4\\MEPOO Modélisation et programmation orientée objet\\L2S4-JAVA\\tp\\src\\serialize\\fichier.txt");
			ObjectInputStream s = new ObjectInputStream(output);
			Vector<Personne> v = (Vector<Personne>)s.readObject();
			for (Personne p : v) {
				System.out.println(p.toString());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
