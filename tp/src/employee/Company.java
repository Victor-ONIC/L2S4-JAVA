package employee;

import java.util.ArrayList;

/*
 * La classe Company représente une entreprise, par exemple Apple.
 * Il peut y avoir plusieurs entreprises. (Google, Apple, Facebook, ...).
 * 
 * Chaque entreprise a un vecteur d'employés.
 * On peut ajouter ou retirer des employés de l'entreprise.
 * Il n'y a qu'un seul directeur par entreprise.
 */

// !!! "un employé ne travaille que pour une entreprise" ??????
class Company {
	String name;
	boolean isDirected;
	ArrayList<Employee> E;
	
	public Company(String name) {
		this.name = name;
		this.isDirected = false;
		this.E = new ArrayList<Employee>();
	}
	
	public void ajouter(Employee e) throws EmployeeException {
		// Check e.
		if (e == null) {
			throw new EmployeeException("ajout: Argument null !");
		}
		
		// Check si cet employé est déjà dans l'entreprise.
		if (E.indexOf(e) != -1) {
			throw new EmployeeException("ajouter: Déjà présent dans l'entreprise !");
		}
		
		// Check s'il y a déjà un directeur.
		if (e instanceof Director) {
			if (this.isDirected) {
				throw new EmployeeException("ajouter: Déjà dirigée !");
			}
			this.isDirected = true;
		}
		
		E.add(e);
	}
	
	public void retirer(Employee e) throws EmployeeException {
		// Check e.
		if (e == null) {
			throw new EmployeeException("retirer: Argument null !");
		}
		
		// Check si l'employé existe bien.
		if (E.indexOf(e) == -1) {
			throw new EmployeeException("retirer: Employé inexistant !");
		}
		
		// Check si le directeur est retiré.
		if (e instanceof Director) {
			this.isDirected = false;
		}
		
		E.remove(e);
	}
	
	public void afficher() {
		for (int i = 0; i < E.size(); i++) {
			System.out.println(name + " " + E.get(i).name);
		}
	}
}
