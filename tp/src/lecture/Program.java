package lecture;

import java.io.FileReader;

public class Program {
	public static void main(String[] args) {
		try {
			
			FileReader f = new FileReader("C:\\Users\\victo\\Desktop\\Dossier_Principal\\UNI\\COURS\\L2S4\\MEPOO Modélisation et programmation orientée objet\\L2S4-JAVA\\tp\\src\\lecture\\texte.txt");
			String content = new String("");
			int count = 1;
			int lineNumber = 1;
			content += Integer.toString(lineNumber) + ' ';

			int c = f.read();
			while (c != -1) {
				// Si le nombre de caractères dépasse 60, on saute une ligne et on met 4 espaces.
				if (count >= 60) {
					content += "\n    ";
					count = 0;
				}
				
				// Si on tombe sur la fin de la ligne, on passe au numéro suivant.
				if (c == '\n') {
					lineNumber++;
					content += (char)c;
					content += Integer.toString(lineNumber) + ' ';
					c = f.read();
					count = 1;
				}
				
				content += (char)c;
				c = f.read();
				count++;
			}
			
			System.out.println(content);
			
			f.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
