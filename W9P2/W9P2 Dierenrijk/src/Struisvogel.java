/**
 @author Van Elias De Hondt
 * 28/11/2022
 */
public class Struisvogel implements Dier, Eierleggend{
    // Attributen
    private String naam;
    private int aantalEierenPerJaar;
    // Constructors
    public Struisvogel(String naam, int aantalEierenPerJaar) {
        this.naam = naam;
        this.aantalEierenPerJaar = aantalEierenPerJaar;
    }
    public String getNaam() {
        return this.naam;
    }
    public int getAantalEierenPerJaar() {
        return this.aantalEierenPerJaar;
    }
    // Methode
    @Override
    public String toString() { // @Override van toString
        return String.format(
                """
                Naam: %s
                Eieren: %d
                        """,
                this.naam,this.getAantalEierenPerJaar());
    }
}
