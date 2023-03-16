/**
 @author Van Elias De Hondt
 * 14/11/2022
 */
public class Lid {
    // Attributen
    private int lidNr;
    private String naam;
    private static int volgendLidNr = 10000;
    // Constructor
    public Lid(String naam) {
        this.naam = naam;
        this.lidNr = Lid.volgendLidNr++;
    }
    // Methode
    public int getLidNr() { // Get ...
        return lidNr;
    }
    public String getNaam() {// Get ...
        return naam;
    }
    public static int getVolgendLidNr() { // Get ...
        return volgendLidNr;
    }
    @Override
    public String toString() {
        return String.format("%d %s", this.lidNr, this.naam);
    }
}
