import java.util.ArrayList;
import java.util.List;

/**
 @author Elias De Hondt
 * 5/12/2022
 */
public class Film extends Artikel{
    // Attributen
    private String titel;
    private List<String> acteurs;
    // Constructors
    public Film(String id, double prijs, String titel, String auteurs) {
        super(id, prijs);
        this.acteurs = new ArrayList<>();
        this.titel = titel;
        this.acteurs.add(auteurs);
    }
    // Methode
    public String getTitel() { // Get..
        return titel;
    }
    public List<String> getActeurs() { // Get..
        return acteurs;
    }
    public void voegActeurToe(String newActeur) {
        this.acteurs.add(newActeur);
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("%s\t\"%s\" (%s)",super.getId(),this.getTitel(),this.getActeurs());
    }
}
