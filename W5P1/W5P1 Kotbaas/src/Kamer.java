import static java.lang.String.format;

/**
 * @author Elias De Hondt
 * 20/10/2022
 */
public class Kamer {
    // Attributen
    private int kamerNummer;
    private Student studentnaam; // Student is een klassen
    private double prijsPerMaand;

    // Constructor
    public Kamer(int kamerNummer, double prijsPerMaand) {
        this.kamerNummer = kamerNummer;
        this.prijsPerMaand = prijsPerMaand;
    }
    // Methode
    public double getPrijsPerMaand() { // get ..
        return prijsPerMaand;
    }
    public void setStudent(Student student) { // set ..
        this.studentnaam = student;
    }
    public String toString() {
        return format("Kamer %d (€%.2f): %s", this.kamerNummer, this.prijsPerMaand, this.studentnaam);
    }
}
