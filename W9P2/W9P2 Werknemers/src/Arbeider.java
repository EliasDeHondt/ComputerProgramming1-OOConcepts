

/**
 @author Van Elias De Hondt
 * 21/11/2022
 */
public class Arbeider extends Werknemers {
    // Attributen
    private static final double MAX_UREN_PER_WEEK = 38;
    private int aantalUren;
    // Constructors
    public Arbeider(String naam, long rijksregisternummer, int aantalUren) {
        super(naam, rijksregisternummer);
        this.aantalUren = aantalUren;
    }
    // Methode
    public double getLoon() {
        double loon = 0;
        if(this.aantalUren > this.MAX_UREN_PER_WEEK){
            loon = this.MAX_UREN_PER_WEEK * super.UURLOON + ((this.aantalUren - this.MAX_UREN_PER_WEEK) * (super.UURLOON * 1.5));
        } else {
            loon = this.aantalUren * super.UURLOON;
        }
        return loon;
    }
    @Override
    public String toString() {
        return String.format("%sLoon: € %.1f\n",super.toString(),this.getLoon());
    }
}
