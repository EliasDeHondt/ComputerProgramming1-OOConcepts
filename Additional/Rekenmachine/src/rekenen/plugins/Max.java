package rekenen.plugins;

/**
 * Van Elias De Hondt
 * 2/12/2022
 */
public class Max implements Plugin{
    // Attributen
    // Constructors
    // Methode
    @Override
    public String getCommand() {
        return "Max";
    }
    @Override
    public double bereken(double x, double y) {
        return Math.max(x,y);
    }
    @Override
    public String getAuteur() {
        return null;
    }
}
