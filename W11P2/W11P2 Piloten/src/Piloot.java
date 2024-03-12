import java.util.Set;
import java.util.TreeSet;

/**
 @author Elias De Hondt
 * 15/12/2022
 */
public class Piloot {
    // Attributes
    private String nationaliteit;
    private String naam;
    private int aantalTitels;
    private Set<Integer> seizoenen;
    // Constructors
    public Piloot(String nationaliteit, String naam, int aantalTitels) {
        seizoenen = new TreeSet<>();
        this.nationaliteit = nationaliteit;
        this.naam = naam;
        this.aantalTitels = aantalTitels;
    }
    // Methods
    public void voegSeizoenToe(int jaar) {
        if (!this.seizoenen.contains(jaar)) {
            this.seizoenen.add(jaar);
        }
    }
    public String getNaam() { // Get..
        return naam;
    }
    public int getAantalTitels() { // Get..
        return aantalTitels;
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("%-20s %-20s %-3d %s\n",
                this.nationaliteit,this.getNaam(),this.aantalTitels,this.seizoenen.toString());
    }
}
