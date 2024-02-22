import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        //Map - reprezentare de date in sistem cheie valoare
        //Exemplu: Gigel are nota 10, Costel are nota 9
        //Map - un array la care dam noi porecle la index
        //Listele sunt ordonate, dar Map-urile nu sunt ordonate

        //Declaram un map
        Map<String,Integer> note_elevi = new HashMap<>();

        //Adaugam elemente
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 9);
        note_elevi.put("Ana", 10);

        //Aflu notele
        System.out.println("Ana are mere" + note_elevi.get("Ana")); //Ana are mere 10

        //Actualizam valori
        note_elevi.replace("Costel", 10);
        System.out.println("Costel si-a marit nota la " + note_elevi.get("Costel")); //Afiseaza: Costel si-a marit nota la 10

        //Aflam dimensiunea
        System.out.println(note_elevi.size()); // 3

        //Stergem valori
        note_elevi.remove("Gigel");
        System.out.println(note_elevi.size()); // 2
        System.out.println(note_elevi.get("Gigel")); //null (vid) -> nu-l mai gaseste pe Gigel

        //Declaram si initializam cu valori - cand stim de exemplu lunile anului
        //Map nu este ordonat
        Map<String,Integer> luni = new HashMap<String,Integer>()
        {{
            put("Jan", 1);
            put("Feb", 2);
            put("Mar", 3);
        }};
        System.out.println(luni);

    }
}
