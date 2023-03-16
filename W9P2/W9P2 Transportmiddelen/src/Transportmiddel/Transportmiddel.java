package Transportmiddel;

/**
 @author Van Elias De Hondt
 * 28/11/2022
 */
public abstract class Transportmiddel {
    // Attributen
    private double snelheid;
    protected long afstand;
    // Constructors
    public Transportmiddel(double snelheid) {
        this.snelheid = snelheid;
    }
    // Methode
    public double getSnelheid() { // Get..
        return this.snelheid;
    }
    public abstract void legAfstandAf(double afstand);
}
