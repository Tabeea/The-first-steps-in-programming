public class Functii {
    // functie = logica delimitata care poate fi refolosita
    // Nu putem folosi spatii in nume!
    // Nu putem defini o functie in alta functie!

    // Exemplu1: O functie care ne printeaza ceva pe ecran
    // Nu ne da niciun raspuns (nu are return)
    // Nu are parametri
    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit");
    }

    // Exemplu2: O functie care saluta clientul in functie de numele lui
    // Nu ne da niciun raspuns (nu are return)
    // Are nevoie de parametri
    public static void printGreetingByName (String nume, String prenume) {
        System.out.println("Buna ziua" + nume + " " + prenume);
    }

    // Exemplu3: O functie care calculeaza media a 3 numere
    // Ne da un raspuns - suma nr va avea return
    // Ce tip de date va avea raspunsul? exemplu: 3+6/2 = 4.5 (double)
    // Are nevoie de parametri
    public static double mediaNr (double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    // Exemplu4: O functie care ne da valoarea lui PI
    // Ne da un raspuns? da
    // Ce tip de date va avea raspunsul? Double - 3.14
    // Are nevoie de parametri? Da
    public static double piValue() {
        // constanta - variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }


    public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // se apeleaza functia
        // intra clientul 2
        printGreeting();
        // apelam o functie cu parametrii, oferind argumente
        printGreetingByName("Simion","Tabeea");
        printGreetingByName("Simion","Nadia");
        printGreetingByName("Simion","Severica");

        System.out.println(mediaNr(3,3,4));
        double media1 = mediaNr(1111,2222,3333);
        double media2 = mediaNr(33,2222,3333);
        double media3 = mediaNr(34,2222,3333);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());
    }
}

