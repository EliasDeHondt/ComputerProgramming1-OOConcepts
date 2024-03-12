import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 @author Elias De Hondt
 * 4/03/2023
 */
public class Restaurant {
    // Attributes
    private final String naam;
    private final String locatie;
    private List<VerkochtArtikel> verkochtArtikels;
    // Constructors
    public Restaurant(String naam, String locatie) {
        this.naam = naam;
        this.locatie = locatie;
    }
    // Methods
    public Map<String, Double> geefOverzichtOmzet() {
        Map<String, Double> overzichtOmset = new HashMap<>();
        for(int i = 0; i <= this.verkochtArtikels.size(); i++) {
            double prijs =  this.verkochtArtikels.get(i).getMenuitem().getPrijs();
            int aantal = this.verkochtArtikels.get(i).getAantal();
            String naam = this.verkochtArtikels.get(i).getNaam();
            double omzet = prijs * aantal;
            overzichtOmset.put(naam, omzet);
            this.verkochtArtikels.get(i).resetAantal();
        }
        return overzichtOmset;
    }
}