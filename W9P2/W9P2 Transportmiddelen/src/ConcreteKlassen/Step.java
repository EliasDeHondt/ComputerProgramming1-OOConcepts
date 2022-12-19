package ConcreteKlassen;

import Transportmiddel.Transportmiddel;

/**
 * Van Elias De Hondt
 * 28/11/2022
 */
public class Step extends Transportmiddel {
    // Attributen
    // Constructors
    public Step(double snelheid) {
        super(snelheid);
    }
    // Methode
    @Override
    public void legAfstandAf(double afstand) {
        afstand = (afstand*10)/super.getSnelheid();
        super.afstand = Math.round(afstand);
        for (int i = 0; i < super.afstand; i++) {
            System.out.print("zzz-");
        }
        System.out.println();
    }
}
