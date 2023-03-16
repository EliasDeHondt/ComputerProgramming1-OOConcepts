/**
 @author Van Elias De Hondt
 * 21/11/2022
 */
public class Persoon {
    // Attributen
    private String naam;
    // Constructors
    public Persoon(String naam) {
        if(naam == null || naam.isEmpty()) {
            throw new IllegalArgumentException("Foutieve waarde [naam]…");
        }
        this.naam = naam;
    }
    // Methode
    public String getNaam() { // Get..
        return this.naam;
    }
    @Override
    public String toString() { // toString
        return String.format("Naam: %s\n",this.getNaam());
    }
}
