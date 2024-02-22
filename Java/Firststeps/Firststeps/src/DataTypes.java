import java.util.Locale;

public class DataTypes {
    public static void main(String[] args) {
        // cele mai folosite 5 tipuri de date:

        // 1. String = sir de caractere delimitate de ghilimele duble (" ") in Java
        String marca = "Dacia";
        String model = "1310";

        // scriem cu litere mari
        System.out.println(marca.toUpperCase());  // va afisa DACIA

        // aflam dimensiunea unui string
        System.out.println(marca.length());

        String a = "3";
        String b = "4";
        System.out.println(a+b); // va afisa 34

        // 2. Integer = numar intreg (int)
        int an_fabricatie = 1987;

        // 3. Double = numar zecimal
        double pret = 2300.50;

        // 4. Boolean = adevarat (1) sau fals (0)
        boolean inmatriculata = false;

        // 5. Char = un singur caracter. De exemplu: #, $, 2, d etc
        char nota = 'A';
    }
}
