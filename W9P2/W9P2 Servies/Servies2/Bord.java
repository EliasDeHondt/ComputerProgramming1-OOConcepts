/**
 * @author Van Elias De Hondt
 * 28/11/2022
 */
public abstract class Bord {
    // Attributen
    private String materiaal;
    private String naam;
    // Constructors
    public Bord(String materiaal, String naam) {
        this.materiaal = materiaal;
        this.naam = naam;
    }
    // Methode
    public abstract double oppervlakte();
    @Override
    public String toString() { // @Override van toString
        return String.format("%s %s",this.materiaal,this.naam);
    }
}
