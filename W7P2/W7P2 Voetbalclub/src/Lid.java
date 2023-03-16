/**
 @author Van Elias De Hondt
 * 14/11/2022
 */
public class Lid {
    // Attributen
    private int id;
    private String naam;
    private Soort soort;
    // Constructor
    public Lid(int id, String naam, Soort soort) {
        this.id = id;
        this.naam = naam;
        this.soort = soort;
    }
    // Methode
    public int getId() { // Get ...
        return this.id;
    }
    public String getNaam() { // Get ...
        return this.naam;
    }
    public Soort getSoort() { // Get ...
        return this.soort;
    }
    @Override
    public String toString() {
        return String.format("%d %s\t\tsoort: %s", this.id, this.naam, this.soort);
    }
}
