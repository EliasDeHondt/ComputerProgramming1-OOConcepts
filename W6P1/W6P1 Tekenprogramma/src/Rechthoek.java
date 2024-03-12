import static java.lang.String.format;

/**
 @author Elias De Hondt
 * 3/11/2022
 */
public class Rechthoek {
    // Attributen
    private double lengte;
    private double breedte;
    private int kleur;
    private String kleurS;
    // Constructors
    public Rechthoek(double lengte, double breedte, int kleur) {
        this.lengte=lengte;
        this.breedte=breedte;
        this.kleur=kleur;
        switch (this.kleur) {
            case 0: kleurS = "zwart"; break;
            case 1: kleurS = "cyaan"; break;
            case 2: kleurS = "magenta"; break;
            case 3: kleurS = "geel"; break;
        }
    }
    // Methode
    public double getLengte() { // Get..
        return this.lengte;
    }
    public double getBreedte() { // Get..
        return this.breedte;
    }
    public int getKleur() { // Get..
        return this.kleur;
    }
    public double oppervlakte() { // Oppervlakte berekenen.
        return this.lengte*this.breedte;
    }
    @Override
    public String toString() {
        return format("Totale oppervlakte %s is: %f", this.kleurS, this.oppervlakte());
    }
}
