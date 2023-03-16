/**
 @author Van Elias De Hondt
 * 14/11/2022
 */
public enum Continent {
    NOORD_AMERIKA(24256000, 470),
    LATIJNS_AMERIKA(17819000, 331),
    EUROPA(10530750, 728),
    AZIE(44579000, 3604),
    AFRIKA(30665000, 654.5),
    AUSTRALIE(8535117, 29.5),
    ANTARCTICA(13209000, 0);
    // Attributen
    public long oppervlakte;
    public double inwoners;
    // Contructor
    private Continent(long oppervlakte, double inwoners) {
        this.oppervlakte = oppervlakte;
        this.inwoners = inwoners;
    }
    // Methode
    public double bevolkingsDichtheid() {
        return (this.inwoners/this.oppervlakte)*1000000;
    }
    @Override
    public String toString() {
        return String.format(" (bev.dichth: %.0f)",this.bevolkingsDichtheid());
    }
}
