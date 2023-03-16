/**
 * @author Van Elias De Hondt
 * 10/10/2022
 */
public class VatDemo {
    public static void main(String[] args) {
        // Deel 1
        Vat Vatbier = new Vat(50);
        System.out.println("Deel 1:");
        System.out.println("Capaciteit: " + Vatbier.getCapaciteit() + " liter");
        System.out.println("Inhoud: " + Vatbier.getInhoud() + " liter");
        Vatbier.vulVolledig();
        for (int i = 0; i < 8; i++) {
            Vatbier.verwijder(2);
        }
        System.out.println("Inhoud na 8 pintjes: " + Vatbier.getInhoud() + " liter");
        System.out.println("Percentage gevuld: " + Vatbier.getPercentageGevuld() + " %");
        //
        System.out.println();
        // Deel2
        System.out.println("Deel 2:");
        Vat Vatwijn = new Vat(100);
        Vatwijn.vul(110 );

        System.out.println("Capaciteit van wijnvat: " + Vatwijn.getCapaciteit() + " liter");
        System.out.println("Inhoud van wijnvat: " + Vatwijn.getInhoud() + " liter");
        System.out.println(Vatwijn.isVol()?"Het vat is vol":"Het vat is niet vol");
        Vatwijn.maakLeeg();
        int teller = 0;
        do {
            Vatwijn.vul(3);
            ++teller;
        } while (!Vatwijn.isVol());
        System.out.println("Aantal keer bijgevuld: " + teller);
        System.out.println("Inhoud: " + Vatwijn.getInhoud()  + " liter");
    }
}