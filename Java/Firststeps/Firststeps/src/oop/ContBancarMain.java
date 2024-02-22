package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop

        // initializam obiecte de tip cont bancar
        // instamte ale clasei ContBancar
        ContBancar cont1 = new ContBancar(titularCont:"Andy S", iban: "RO001");
        ContBancar cont2 = new ContBancar(titularCont:"Crina S", iban: "RO002");


        // apelem metoda descrie
        cont1.descriere();
        cont2.descriere();

        // activam conturile
        cont1.activareCont(pinUtilizator: 7777);
        cont2.activareCont();
        cont1.descriere();
        cont2.descriere();

        // alimentam contul
        cont1.alimentareCont(suma_depusa:300.50);
        cont2.alimentareCont(suma_depusa:700);
        cont2.alimentareCont(suma_depusa:300);

        // negative testing, cheltuim mai mult decat avem
        cont1.plataCard(suma_cheltuita: 500); // nu, 300.5 => pass

        // positive cu suma exacta
        cont1.plataCard(suma_cheltuita: 300.5); //  da, 0 => pass

        //positive de 2x
        cont2.plataCard(suma_cheltuita:100);
        cont2.plataCard(suma_cheltuita:200); // da, 700

        cont2.interogareSold



    }
}
