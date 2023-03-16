package ConcreteKlassen;

import Transportmiddel.Transportmiddel;

/**
 @author Van Elias De Hondt
 * 28/11/2022
 */
public class Tram extends Transportmiddel {
    // Attributen
    // Constructors
    public Tram(double snelheid) {
        super(snelheid);
    }
    // Methode
    @Override
    public void legAfstandAf(double afstand) {
        afstand = (afstand*10)/super.getSnelheid();
        super.afstand = Math.round(afstand);
        for (int i = 0; i < super.afstand; i++) {
            System.out.print("ting-");
        }
        System.out.println();
    }
}
