/**
 * Van Elias De Hondt
 * 21/11/2022
 */
public class Koe extends Boerderijdieren {
    // Attributen
    private double literMelkPerDag;
    // Constructors
    public Koe(String naam, double literMelkPerDag) {
        super(naam, "Boeboe", "gras");
        this.literMelkPerDag = literMelkPerDag;
    }
    // Methode
    @Override
    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s en geeft %.1f liter melk per dag",
                super.getNaam(),super.getGeluid(),super.getVoeding(),this.literMelkPerDag);
    }
}
