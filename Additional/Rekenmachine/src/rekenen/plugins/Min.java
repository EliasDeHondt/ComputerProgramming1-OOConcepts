package rekenen.plugins;

/**
 @author Elias De Hondt
 * 2/12/2022
 */
public class Min implements Plugin{
    // Attributen
    // Constructors
    // Methode
    @Override
    public String getCommand() {
        return "Min";
    }
    @Override
    public double bereken(double x, double y) {
        return Math.min(x,y);
    }
    @Override
    public String getAuteur() {
        return null;
    }
}
