package tp1;

class ex1 {
    public static void main(String[] args) {
        int taille = args.length;

        if (taille == 0) return;

        String[] tab = new String[taille];

        for (int i = 0; i < taille; i++) {
            String element = args[taille - 1 - i];
            int elementSize = element.length();
            int index = elementSize;
            String output = "";

            while (index > 0) {
                output += element.charAt(index-1);
                index--;
            }
            tab[i] = output;
        }        

        for (String element : tab) {
            System.out.println(element + " ");
        }
    }
}
