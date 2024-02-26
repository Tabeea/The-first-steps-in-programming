/*
Operatori:
a) Operatori aritmetici: +,-, *, /, %
b) Operatori de comparare: <>, ==, !=, >=, <=
c) Logici: && (and), || (or), ! (Not)
! -> Pui o intrebare si intorci rezultatul

Modulo (%) - restul impartirii
Mai departe vom folosi operatorii in flow control (if else)
 */

public class Operatori {
    public static void main(String[] args) {
        int a = 3; // o declarare && initializare
        int b = 5;
        a = b; // suprascriere

        // Operatori aritmetici
        System.out.println(11+a);
        System.out.println(11%b); // 11 / 5 = 2 rest 1 (Afiseaza 1, deoarece modulo (%) este restul impartirii)

        // Operatori de comparare
        System.out.println(a-1>=b); //5-1>=5 ? False (Afiseaza false)
        System.out.println(a!=b); //5!=5 ? False (Afiseaza false)
        System.out.println(a==b); //5==5 ? True (Afiseaza true)

        // Operatori logici
        System.out.println(7>b && 8>b); // 7>5 AND 8>5 True
        System.out.println(7>b || 3>b); // 7>5 SAU 3>5 True
        System.out.println(7>b && (8>b || 3>b)); // 7>5 && (8>5 || 3>5) => TRUE AND (TRUE) => True
        System.out.println(7>b && (2>b || 3>b)); // 7>5 && (2>5 || 3>5) => TRUE AND (FALSE) => False
        System.out.println(7>b || (2>b || 3>b)); // 7>5 || (2>5 || 3>5) => TRUE OR (FALSE) => True
        System.out.println(!(7>b)); // Not(7>5) => NOT TRUE => False
    }
}


