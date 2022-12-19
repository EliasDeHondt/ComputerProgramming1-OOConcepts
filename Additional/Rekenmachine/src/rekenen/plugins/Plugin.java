package rekenen.plugins;

/**
 * PEER TUTORING
 * REKENMACHINE
 */
public interface Plugin {
    //Opgave 1.1
    String getCommand();
    double bereken(double x, double y);
    String getAuteur();
}