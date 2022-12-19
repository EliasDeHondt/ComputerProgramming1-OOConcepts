/**
 * Van Elias De Hondt
 * 28/11/2022
 */
public class RondBord extends Bord{
    // Attributen
    private double diameter;
    // Constructors
    public RondBord(String materiaal, String naam, double diameter) {
        super(materiaal, naam);
        this.diameter = diameter;
    }
    // Methode
    @Override
    public double oppervlakte() {
        return this.diameter*Math.PI;
    }
}
