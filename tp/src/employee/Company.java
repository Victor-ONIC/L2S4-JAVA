package employee;

import java.util.ArrayList;

/*
 * La classe Company représente une entreprise, par exemple Apple.
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





//import java.util.HashMap;
//
//public class Company {
//	HashMap<String, Employee> E;
//	
//	public Company() {
//		this.E = new HashMap<String, Employee>();
//	}
//	
//	// Exceptions:
//	// 1 employé 1 entreprise.
//	// 1 directeur.
//	public void ajouter(Employee e, String company) {
//		if (!E.containsValue(e)) {
//			if (e.getClass().getSimpleName() == "Director") {
//				for (Employee emp : E.values()) {
//					if (emp.getClass().getSimpleName() == "Director") {
//						// Exception: il y a déjà un directeur.
//					}
//				}
//				E.put(company, e);
//			} else {
//				E.put(company, e);
//			}
//		} else {
//			// Exception: cet employé à déjà une autre entreprise.
//		}
//	}
//	
//	// Exceptions:
//	// Impossible d'enlever un employé qui ne travaille pas pour cette entreprise.
//	public void retirer(Employee e, String company) {
//		if (E.get(company) == e) {
//			E.remove(company);
//		} else {
//			// Exception: cet employé ne travaille pas dans cette entreprise.
//		}
//	}
//	
//	public void afficher() {
//		E.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue().name));
//	}
//}
