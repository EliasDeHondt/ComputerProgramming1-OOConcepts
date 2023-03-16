/**
 @author Van Elias De Hondt
 * 4/03/2023
 */
public class Menuitem {
    // Attributes
    private final String naam;
    private final double prijs;
    // Constructors
    public Menuitem(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }
    public String getNaam() {
        return this.naam;
    }
    public double getPrijs() {
        return this.prijs;
    }
}