package oop;

public class ContBancar {
    // program files = definim logica unui cont bancar

    // oop = pbject oriented programming
    // poo = programare orientata pe obiecte

    // o clasa = este un tip nou
    // este definitia unui concept
    // O clasa este reteta la pasta carbonara, ADN-ul uman
    // ex: clasa Car;

    // un obiect = instanta unei clase (implementarea clasei)
    // paste carbonara - obiect, un om
    // Ex: 10 obiecte de tip Car

    // fields = proprietati = atribuire
    // variabile (fields)
    // ex: culoare, marca, model, consum, pret, esteOprita

    // metode - actiuni ce pot fi facute de obiecte
    // functii
    // ex: accelereaza(), franeaza(), deschideUsa(), vopsire()

    // proprietatile, fields
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private pin = 7777;
    int incercari_activare;
    // constructor = are rol de a impune date de start
    // ca si * (stelutele) din formulare, required fields
    // click dreapta generate -> costructor -> click pe titularCont, iban -> ok
    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    // metode - actiunile clasei
    public void descriere(String nume) {
        System.out.println("Titular " + this.titularCont);
        System.out.println("Iban " + this.iban);
        System.out.println("Sold" + this.sold);
        System.out.println("Activ" + this.activ);
        System.out.println("Numar de incercari gresite" + this.incercari_activare);


    }

    public void activareCont(int pinUtilizator) {

        // modifica activ in true doar daca pinul este corect
        if (pinUtilizator == this.pin) {
            this.activ = true;
        } else {
            System.out.println("PIN gresit");
            this.incercari_activare++; //incrementeaza
        }
    }

    public void alimentareCont(double suma_depusa) {
        // la ce aveam in cont (this.sold) se mai adauga suma depusa
        this.sold = this.sold + suma_depusa;
        System.out.println("Ati depus cu succes suma de "+ suma_depusa + ". Aveti in cont suma de" +this.sold);

    }
    public  void plataCard (double suma_cheltuita) {
        System.out.println("Buna" + this.titularCont);
        // pot sa cheltuiesc doar ce am
        // daca suma ch <=sold
        if (suma_cheltuita <= this.sold) {
            // dispar banii din cont
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ai cheltuit " + suma_cheltuita);

        } else {
            System.out.println("Fonduri insuficiente");
        }
    }

}
