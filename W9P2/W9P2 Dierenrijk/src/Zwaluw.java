/**
 @author Elias De Hondt
 * 28/11/2022
 */
public class Zwaluw implements Dier, Eierleggend, Vliegend{
    // Attributen
    private String naam;
    private int aantalEierenPerJaar;
    private double maxVliegsnelheid;
    // Constructors
    public Zwaluw(String naam, int aantalEierenPerJaar, double maxVliegsnelheid) {
        this.naam = naam;
        this.aantalEierenPerJaar = aantalEierenPerJaar;
        this.maxVliegsnelheid = maxVliegsnelheid;
    }
    // Methode
    @Override
    public String getNaam() {
        return this.naam;
    }
    @Override
    public int getAantalEierenPerJaar() {
        return this.aantalEierenPerJaar;
    }
    @Override
    public double getMaxVliegsnelheid() {
        return this.maxVliegsnelheid;
    }

    @Override
    public String toString() { // @Override van toString
        return String.format(
                """
                Naam: %s
                Eieren: %d
                Snelheid: %.0f km/h
                        """, this.naam,this.aantalEierenPerJaar,this.maxVliegsnelheid);
    }
}
