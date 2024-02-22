public class While {
    public static void main(String[] args) {
        //while - loop, ciclu repetitiv
        //Zona de cod care se repeta atat timp cat o conditie este true
        //Problema: masina merge cat timp inca are benzina
        int litri_benzina = 10;
        while (litri_benzina > 0) {
            //Acceleram
            System.out.println("Vruum, vruum!");
            //Sccadem benzina
            litri_benzina = litri_benzina - 1; //9
            //Aprindem beculetul cand avem <=3 litri
            if (litri_benzina <= 3) {
                System.out.println("Se aprinde becul rosu");
            }
            //while poate fi privit ca o fantana arteziana cu circuit inchis
            //supapa = litri_benzina;
        }
        System.out.println("Stop! Nu mai avem benzina!");
    }
}
