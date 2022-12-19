/**
 * Van Elias De Hondt
 * 21/11/2022
 */
public abstract class Werknemers {
    // Attributen
    public static final double UURLOON = 12.5;
    private String naam;
    private long rijksregisternummer;
    // Constructors
    public Werknemers(String naam, long rijksregisternummer) {
        this.naam = naam;
        this.rijksregisternummer = rijksregisternummer;
    }
    // Methode
    public abstract double getLoon();
    @Override
    public String toString() {
        return String.format("Naam: %s\nNummer: %s\n",
                this.naam,this.rijksregisternummer);
    }
}
