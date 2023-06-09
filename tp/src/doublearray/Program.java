package doublearray;

public class Program {
	public static void main(String[] args) {
		// Tests de la classe DoubleArray.
		double[][] T = {
				{1, 2, 3},
				{4, 5, 6},
		};
		
		double[][] T2 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		System.out.println("Tableau T: ");
		DoubleArray.display(T);
		
		System.out.println("Les lignes du tableau T sont-elles toutes de la même longueur ?");
		System.out.println(DoubleArray.regular(T));
		
		System.out.println("Somme des lignes de T: ");
		double[] ret = DoubleArray.lineSum(T);
		for (int i = 0; i < ret.length; i++) {
			System.out.println(ret[i]);
		}
		
		System.out.println("Tableau de la somme de T et T2: ");
		double[][] somme = DoubleArray.sum(T, T2);
		DoubleArray.display(somme);
	}
}
