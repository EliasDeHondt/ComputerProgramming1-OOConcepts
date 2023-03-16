import java.util.*;

/**
 @author Van Elias De Hondt
 * 19/12/2022
 */
public class Getallen {
    // Classes

    // Attributes
    private List<Double> getallen;
    // Constructors
    public Getallen() {
        this.getallen = new ArrayList<>();
    }
    public Getallen(Getallen getal1){ // copy-constructor
        this.getallen = getal1.getallen;
    }
    // Methods
    public void voegToe(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new RekenException("is NaN | is Infinite");
        }
        this.getallen.add(d);
    }
    public double gemiddelde() {
        if (this.getallen.size() == 0) {
            throw new RekenException("Er zijn geen getallen in de list");
        }
        double gemiddelde = 0;
        for (Double aantal : this.getallen) {
            gemiddelde = gemiddelde + aantal;
        }
        return gemiddelde/this.getallen.size();
    }

}
