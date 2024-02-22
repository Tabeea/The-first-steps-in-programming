import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // Flow control - if else - evalueaza  conditii si bifurca codul in functie de rezultat

        System.out.println("Pornim radio");
        boolean piesa_faina = true; // invat calculatorul daca piesa este faina sau nu

        // Cod pentru "Daca piesa este frumoasa, dau mai tare radio"
        if (piesa_faina==true) {
            System.out.println("Dau mai tare radio");
            System.out.println("Incep sa fredonez piesa");
        }
        System.out.println("Oprim radio");

        // if else
        int nr = 4;
        if (nr % 2 ==0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
        // Daca un numar este pozitiv sau nu
        if (nr > 0) {
            System.out.println("pozitiv");
        } else {
            System.out.println("nu este pozitiv");
        }

        //if, else if, else
        // luam date de la tastatura
        Scanner sc = new Scanner(System.in);
        // Scanner ne ajuta sa luam date de la tastatura in Java - o variabila
        // "=" - egal este un operator de atribuire
        System.out.println("Introdu ora:");
        int ora = sc.nextInt();
        if (ora < 0) {
            System.out.println("ora invalida");
        } else if (ora <= 11) {
            System.out.println("Neata!");
        } else if (ora <= 18) {
            System.out.println("Buna ziua!");
        } else if (ora <= 21) {
            System.out.println("Buna seara!");
        } else if (ora <= 24) {
            System.out.println("Noapte buna!");
        } else {
            System.out.println("Ora invalida");
        }

        // Flow control
        // Switch - se foloseste cand stim valorile posibile
        System.out.println("alege optiunea");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("meniu anterior");
                break; // daca gaseste cazul 0, nu mai merge mai departe
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("eng");
                break;
            default: // in loc de else
                System.out.println("optiune invalida");
        }
    } // Acolada inchide functia main
} // Acolada inchide clasa -> nu putem scrie cod in afara functiei main
