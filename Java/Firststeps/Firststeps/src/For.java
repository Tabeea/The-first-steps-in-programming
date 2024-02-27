public class For {
    public static void main(String[] args) {
        // for - loop, str repetitiva
            // De unde incepem?
            // Pana unde mergem?
            // Pasul de parcurgere

        // Problema: Printam 101 dalmatieni
        for (int i = 1; i <=101; i++) {
            System.out.println("Dalmatianul cu nr " + i);
        }
        // For - ne ajuta sa parcurgem un array prin intermediul index-ului
        int[] numere = {3,7,10,20,30}; //numere[0]=3
        for (int i = 0; i < numere.length; i++) {
            System.out.println("Elementul are index " + i + " si valoarea " + numere[i]);
        }

        // for each - parcurge toate elementele din array si ajunge direct la valoare
        for (int numar: numere) {
            System.out.println("Numarul este: " + numar);
        }
        // Parcurgere array de culori
        String[] culori = {"Alb", "Rosu", "Galben"};
        for (String culoare: culori) {
            System.out.println("Culoarea actuala este " + culoare);
        }
        // Suma numerelor din array
        int s = 0;
        for (int numar: numere) {
            s = s + numar;
        }
    }
}
