package tp1;

class ex3 {
    public static void main(String[] args) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"
        };

        int d = 29, m = 2, y = 2004;

        if ((y % 4 != 0 && m == 2 && d == 28) ||                        // fin du mois de février
            (y % 4 == 0 && m == 2 && d == 29) ||                        // fin du mois de février en année bissextile
            (d == 30 && (m == 4 || m == 6 || m == 9 || m == 11) ) ||    // fin des mois de 30 jours
            d == 31                                                     // fin des autres mois
            ) {
            if (m == 12) {  // fin de l'année
                y++;
                m = 1;
                d = 1;
            } else {
                m++;
                d = 1;
            }
        } else {
            d++;
        }

        System.out.println("Tomorrow is " + months[m-1] + " " + d + " " + y);
    }
}
