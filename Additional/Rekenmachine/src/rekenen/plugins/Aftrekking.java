package rekenen.plugins;

/**
 @author Elias De Hondt
 * 2/12/2022
 */
public class Aftrekking implements Plugin {
    // Attributen
    // Constructors
    // Methode
    @Override
    public String getCommand() {
        return "-";
    }
    @Override
    public double bereken(double x, double y) {
        return x - y;
    }
    @Override
    public String getAuteur() {
        return null;
    }
}
