package ConcreteKlassen;

import Transportmiddel.Transportmiddel;

/**
 @author Van Elias De Hondt
 * 28/11/2022
 */
public class TeVoet extends Transportmiddel {
    // Attributen
    // Constructors
    public TeVoet(double snelheid) {
        super(snelheid);
    }
    // Methode
    @Override
    public void legAfstandAf(double afstand) {
        afstand = (afstand*10)/super.getSnelheid();
        super.afstand = Math.round(afstand);
        for (int i = 0; i < super.afstand; i++) {
            System.out.print("stap-");
        }
        System.out.println();
    }
}
