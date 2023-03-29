package tp1;

class ex2 {
    public static void main(String[] args) {
        try {
            double a = Double.valueOf(args[0]);
            double b = Double.valueOf(args[1]);
            double c = Double.valueOf(args[2]);

            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        // 0 = 0
                        System.out.println("Tous les nombres sont des solutions.");
                    } else {
                        // c = 0, c != 0
                        System.out.println("Pas de solution.");
                    }
                } else {
                    // Linéaire: bx + c = 0, b != 0 -> x = -c/b
                    double resultat = (-c) / b;
                    System.out.println("Une solution: " + resultat);
                }
            } else {
                // Quadratique: ax^2 + bx + c = 0, a != 0 -> x = -b +- sqrt(b^2-4ac)/2a
                double delta = (b*b) - (4*a*c);
                if (delta < 0) {
                    System.out.println("Pas de solutions réelles.");
                } else if (delta == 0) {
                    double x0 = (-b) / (2*a);
                    System.out.println("Une solution: " + x0);
                } else {
                    double x1 = ((-b) + Math.sqrt(delta)) / 2*a;
                    double x2 = ((-b) - Math.sqrt(delta)) / 2*a;
                    System.out.println("Deux solutions: " + x1 + " et " + x2);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid syntax: " + e.getMessage());
        }
    }
}
