package serialize;

import java.util.Vector;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ProgramOut {
	public static void main(String[] args) {
		Vector<Personne> v = new Vector();
		v.add(new Personne("Victor", 20, "0786978148"));
		v.add(new Personne("Matthieu", 18, "0102030405"));
		
		try {			
			
			FileOutputStream output = new FileOutputStream("C:\\Users\\victo\\Desktop\\Dossier_Principal\\UNI\\COURS\\L2S4\\MEPOO Modélisation et programmation orientée objet\\L2S4-JAVA\\tp\\src\\serialize\\fichier.txt");
			ObjectOutputStream s = new ObjectOutputStream(output);
			s.writeObject(v);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
