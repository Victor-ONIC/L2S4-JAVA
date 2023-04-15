package doublearray;

public class DoubleArray {

    public static void display(double[][] t) {
    	if (t == null) return;
    	
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static boolean regular(double[][] t) {
    	if (t == null) return false;
    	
        boolean regulier = true;
        int taille = t[0].length;

        for (int i = 0; i < t.length; i++) {
            if (t[i].length != taille ) {
                regulier = false;
            }
        }
        return regulier;
    }

    public static double[] lineSum(double[][] t) {
    	if (t == null) return null;
    	
        int taille = t.length;
        double[] resultat = new double[taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < t[i].length; j++) {
                resultat[i] += t[i][j];
            }
        }
        return resultat;
    }

    public static double[][] sum(double[][] t1, double[][] t2) {
        if (t1 == null || t2 == null) {
            return null;
        }
        if (!regular(t1) || !regular(t2)) {
        	return null;
        }
        if (t1.length != t2.length) {
        	return null;
        }
        if (t1[0].length != t2[0].length) {
        	return null;
        }

        int length = t1.length;
        int lineLength = t1[0].length;
        double[][] sum = new double[length][lineLength];
        for (int i = 0; i < length; i++) {
        	for (int j = 0; j < lineLength; j++) {
        		sum[i][j] = t1[i][j] + t2[i][j];
        	}
        }
        return sum;
    }
}
