package serialize;

import java.io.Serializable;

public class Personne implements Serializable {
	private String nom;
	private int age;
	private String tel;
	
	public Personne(String nom, int age, String tel) {
		this.nom = nom;
		this.age = age;
		this.tel = tel;
	}
	
	public String toString() {
		return "[" + nom + ", " + age + ", " + tel + "]";
	}
}
