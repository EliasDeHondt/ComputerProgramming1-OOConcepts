import static java.lang.String.format;

/**
 * @author Van Elias De Hondt
 * 20/10/2022
 */
public class Student {
    // Attributen
    private String naam;
    private String straatNr;
    private String gemeente;
    private int postnummer;

    // Constructor
    public Student(String naam, String straatNr, String gemeente, int postnummer) {
        this.naam = naam;
        this.straatNr = straatNr;
        this.gemeente = gemeente;
        this.postnummer = postnummer;
    }
    // Methode
    public String toString() {
        return format("%s, %s, %d %s", this.naam, this.straatNr, this.postnummer, this.gemeente);
    }
}
