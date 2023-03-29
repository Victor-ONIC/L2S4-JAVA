package employee;

public class Paie {
	public static void display(Employee[] T) {
		System.out.println("Salaires: ");
		for (int i = 0; i < T.length; i++) {
			System.out.print(T[i].name + ": ");
			System.out.println(T[i].getSalary());
		}
	}
}
