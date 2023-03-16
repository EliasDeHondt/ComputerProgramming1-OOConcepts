import static java.lang.String.format;

/**
 @author Van Elias De Hondt
 * 24/10/2022
 */
public class Film {
    // Attributen
    private String titel;
    private int jaar;

    // Constructor
    public Film(String titel, int jaar) {
        this.titel = titel;
        this.jaar = jaar;
    }

    // Methode
    public String getTitel() { // get ..
        return this.titel;
    }

    public int getJaar() { // get ..
        return this.jaar;
    }

    @Override
    public String toString() { // toString
        return format("%-26s %4d", this.getTitel(), this.getJaar());
    }
}
