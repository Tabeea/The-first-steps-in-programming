public class Functii {
    // functie = logica delimitata care poate fi refolosita
    // nu putem folosi spatii in nume
    // nu putem defini o functie in alta functie
    // o functie care ne printeaza ceva pe ecran
    // nu ne da niciun raspuns (nu are return)
    // nu are parametri
    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit");
    }
    // o functie care saluta clientul in functie de numele lui
    // nu ne da niciun raspuns (nu are return)
    // are nevoie de parametri
    public static void printGreetingByName (String nume, String prenume) {
        System.out.println("Buna ziua" + nume + " " + prenume);
    }

    // o functie care calculeaza media a 3 numere
    // ne da un raspuns - suma nr va avea return
    // Ce tip de date va avea raspunsul? 3+6/2 = 4.5 (double)
    // are nevoie de parametri
    public static void mediaNr (double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    // o functie care ne da valoarea lui PI
    // ne da un raspuns? da
    // Ce tip de date va avea raspunsul? Double - 3.14
    // are nevoie de parametri? Da
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
        // apelam o functie cu parametrii oferind argumente
        printGreetingByName("Simion","Tabeea");
        printGreetingByName("Simion","Nadia");
        printGreetingByName("Simion","Severica");

        System.out.println(mediaNr(3,3,4));
        double media1 = mediaNr(1111,2222,3333);
        double media2 = mediaNr(1111,2222,3333);
        double media3 = mediaNr(1111,2222,3333);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());
    }
}

