public class Variabile {
    public static void main(String[] args) {
        // declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        // strongly typed - trebuie sa specificam tipul de date al variabilelor cu care lucram

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // suprascrierea
        modelMasina = "XC 60 facelift"; // nu mai este nevoie sa ii spun tipul de date - este deja declarat

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // declarare
        String nume;
        String prenume;
        // initializare
        nume = "Simion";
        prenume = "Tabeea";
        int varsta = 27;
        // concatenare de stringuri
        System.out.println(nume + " " + prenume + "cu varsta de " + varsta + " de ani");

    }
}
