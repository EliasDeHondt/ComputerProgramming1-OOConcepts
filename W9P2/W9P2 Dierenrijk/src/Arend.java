/**
 * Van Elias De Hondt
 * 28/11/2022
 */
public class Arend implements Dier,Eierleggend,Vliegend {
    // Attributen
    private String naam;
    private int aantalEierenPerJaar;
    private double maxVliegsnelheid;
    private double duiksnelheid;
    // Constructors
    public Arend(String naam, int aantalEierenPerJaar, double maxVliegsnelheid, double duiksnelheid) {
        this.naam = naam;
        this.aantalEierenPerJaar = aantalEierenPerJaar;
        this.maxVliegsnelheid = maxVliegsnelheid;
        this.duiksnelheid = duiksnelheid;
    }
    // Methode
    public String getNaam() {
        return this.naam;
    }
    public int getAantalEierenPerJaar() {
        return this.aantalEierenPerJaar;
    }
    public double getMaxVliegsnelheid() {
        return this.maxVliegsnelheid;
    }
    public double getDuiksnelheid() {
        return duiksnelheid;
    }
    @Override
    public String toString() { // @Override van toString
        return String.format(
                """
                Naam: %s
                Eieren: %d
                Snelheid: %.0f km/h
                Duiksnelheid: %.0f km/h
                        """,
                this.getNaam(),this.getAantalEierenPerJaar(),
                this.getMaxVliegsnelheid(),this.getDuiksnelheid());
    }
}
