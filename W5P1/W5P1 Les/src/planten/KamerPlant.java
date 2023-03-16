package planten;

/**
 * @author Elias De Hondt
 * 20/10/2022
 */
public class KamerPlant {
    // Attributen
    private String naam;
    private double prijs;
    private double hoogten; // in cm

    // Constructor
    public KamerPlant(String naam, double prijs, double hoogten) {
        this.naam = naam;
        this.prijs = prijs;
        this.hoogten = hoogten;
    }
    public KamerPlant() { // Default constructor
        this("Onbekend",  5.0, 0);
    }


    // Methode
    public String getnaam() { // get ..
        return naam;
    }
    public void setprijs(double prijs) { // set ..
        if (prijs >= 0) {
            this.prijs = prijs;
        }
    }
    public void drukAf() {
        System.out.printf("%s: %.2f (%.0fcm)\n", this.naam, this.prijs, this.hoogten);
    }

}
