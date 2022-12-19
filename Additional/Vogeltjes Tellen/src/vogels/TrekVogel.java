package vogels;

/**
 * Van Elias De Hondt
 * 19/09/2022
 */
public class TrekVogel extends Vogel{
    private String bestemming;
    public TrekVogel(String naam, Habitat habitat, String winterBestemming) {
        super(naam, habitat);
        this.bestemming = winterBestemming;
    }
    @Override
    public String toString() {
        return String.format("%s %-10s --> trekt naar %s",super.toString(),super.verblijftIn(),this.bestemming);
    }
}
