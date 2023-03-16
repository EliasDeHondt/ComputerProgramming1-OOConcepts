/**
 @author Van Elias De Hondt
 * 24/11/2022
 */
public class Persoon {
    // Attributen
    private Telefoon telefoon;
    private String naam;
    // Constructors
    public Persoon(Telefoon telefoon, String naam) {
        this.telefoon = telefoon;
        this.naam = naam;
    }
    // Methode
    public Telefoon getTelefoon() {
        return telefoon;
    }
    public String getNaam() {
        return naam;
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("%s - %s",
                this.naam,this.telefoon.toString());
    }
}
