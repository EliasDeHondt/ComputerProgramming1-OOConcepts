/**
 @author Van Elias De Hondt
 * 5/12/2022
 */
public abstract class Artikel {
    // Attributen
    private String id;
    private double prijs;
    // Constructors
    public Artikel(String id, double prijs) {
        this.id = id;
        this.prijs = prijs;
    }
    // Methode
    public String getId() { // Get..
        return id;
    }
    public double getPrijs() { // Get..
        return prijs;
    }
}
