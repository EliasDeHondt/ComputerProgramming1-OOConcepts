/**
 * Van Elias De Hondt
 * 21/11/2022
 */
public class Kip extends Boerderijdieren {
    // Attributen
    private int eierenPerWeek;
    // Constructors

    public Kip(String naam, int eierenPerWeek) {
        super(naam, "Toktok", "mais");
        this.eierenPerWeek = eierenPerWeek;
    }
    // Methode
    @Override
    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s en legt %d eieren per week",
                super.getNaam(),super.getGeluid(),super.getVoeding(),this.eierenPerWeek);
    }
}
