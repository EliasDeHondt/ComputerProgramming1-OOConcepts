package rekenen.plugins;

/**
 @author Elias De Hondt
 * 2/12/2022
 */
public class Macht implements Plugin{
    // Attributen
    // Constructors
    // Methode
    @Override
    public String getCommand() {
        return "^";
    }
    @Override
    public double bereken(double x, double y) {
        return Math.pow(x,y);
    }
    @Override
    public String getAuteur() {
        return null;
    }
}
