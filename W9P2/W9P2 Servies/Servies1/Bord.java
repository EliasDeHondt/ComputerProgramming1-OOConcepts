/**
 * @author Van Elias De Hondt
 * 28/11/2022
 */
public class Bord {
    // Attributen
    private String materiaal;
    private String naam;
    // Constructors
    public Bord(String materiaal, String naam) {
        this.materiaal = materiaal;
        this.naam = naam;
    }
    // Methode
    public double oppervlakte() {
        return 0.0;
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("%-10s %-10s",this.materiaal,this.naam);
    }
}
