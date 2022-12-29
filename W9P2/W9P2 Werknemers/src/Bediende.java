

/**
 * Van Elias De Hondt
 * 21/11/2022
 */
public class Bediende extends Werknemers {
    // Attributen
    private static final int LOONFACTOR = 192;
    private double weddeBarema;
    // Constructors
    public Bediende(String naam, long rijksregisternummer, double weddeBarema) {
        super(naam, rijksregisternummer);
        this.weddeBarema = weddeBarema;
    }
    // Methode
    public double getLoon() {
        return super.UURLOON * this.LOONFACTOR * this.weddeBarema;
    }
    @Override
    public String toString() {
        return String.format("%sLoon: € %.1f\n",super.toString(),this.getLoon());
    }
}
