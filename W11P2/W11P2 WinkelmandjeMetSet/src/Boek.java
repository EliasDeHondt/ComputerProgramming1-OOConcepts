import java.util.ArrayList;
import java.util.List;

/**
 @author Elias De Hondt
 * 5/12/2022
 */
public class Boek extends Artikel {
    // Attributen
    private String titel;
    private List<String> auteurs;
    // Constructors
    public Boek(String id, double prijs, String titel, String auteurs) {
        super(id, prijs);
        this.auteurs = new ArrayList<>();
        this.titel = titel;
        this.auteurs.add(auteurs);
    }
    // Methode
    public String getTitel() { // Get..
        return titel;
    }
    public List<String> getAuteurs() { // Get..
        return auteurs;
    }
    public void voegAuteurToe(String newAuteur) {
        this.auteurs.add(newAuteur);
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("%s\t\"%s\" (%s)",super.getId(),this.getTitel(),this.getAuteurs());
    }
    @Override
    public int compareTo(Film o) {
        return this.getTitel().compareTo(o.getTitel());
    }
}
