/**
 @author Van Elias De Hondt
 * 21/11/2022
 */
public class Konijn extends Boerderijdieren {
    // Attributen
    private boolean isGraver;
    // Constructors
    public Konijn(String naam, boolean isGraver) {
        super(naam, "Snifsnif", "gras");
        this.isGraver = isGraver;
    }
    // Methode
    @Override
    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s en graaft %b",
                super.getNaam(),super.getGeluid(),super.getVoeding(),this.isGraver);
    }
}
