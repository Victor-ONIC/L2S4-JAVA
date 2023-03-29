package employee;

public class Program {
	public static void main(String[] args0 ) {
		// Tests de l'exercice 1.
		Employee e1 = new Employee("Victor", 40*4, 13);
		Employee e2 = new Employee("Matthieu", 34*4, 12.5);
		Employee e3 = new Employee("Marc", 33*4, 14);
		Salesman s1 = new Salesman("Kinda", 33*4, 15, 30000);
		Salesman s2 = new Salesman("Nora", 32*4, 14.5, 26000);
		Director d = Director.getInstance();
		d.init("Quentin", 39*4, 25);
		
		Employee[] T = {e1, e2, e3, s1, s2, d};
		
		Paie.display(T);
	}
}
