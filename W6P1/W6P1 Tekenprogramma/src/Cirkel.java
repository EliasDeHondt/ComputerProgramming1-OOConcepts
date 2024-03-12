import static java.lang.String.format;

/**
 @author Elias De Hondt
 * 3/11/2022
 */
public class Cirkel {
    // Attributen
    private double straal;
    private int kleur;
    private String kleurS;
    // Constructors
    public Cirkel(double straal, int kleur) {
        this.straal=straal;
        this.kleur=kleur;
        switch (this.kleur) {
            case 0: kleurS = "zwart"; break;
            case 1: kleurS = "cyaan"; break;
            case 2: kleurS = "magenta"; break;
            case 3: kleurS = "geel"; break;
        }
    }
    // Methode
    public double getStraal() { // Get..
        return this.straal;
    }
    public int getKleur() { // Get..
        return this.kleur;
    }
    public double oppervlakte() { // Oppervlakte berekenen.
        return (this.straal*2)*Math.PI;
    }
    @Override
    public String toString() {
        return format("Totale oppervlakte %s is: %f", this.kleurS, this.oppervlakte());
    }

}
