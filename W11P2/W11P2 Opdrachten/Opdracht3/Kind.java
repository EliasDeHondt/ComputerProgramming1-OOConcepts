/**
 * Van Elias De Hondt
 * 15/12/2022
 */
/**
 * Van Elias De Hondt
 * 8/12/2022
 */
public class Kind{
    // Attributen
    private String naam;
    private int leeftijd;
    private double lengte;
    // Constructors
    public Kind(String naam, int leeftijd, double lengte) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.lengte = lengte;
    }
    // Methode
    public String getNaam() { // Get..
        return naam;
    }
    public int getLeeftijd() { // Get..
        return leeftijd;
    }
    public double getLengte() { // Get..
        return lengte;
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("%s (%d) %.2fcm groot",
                this.getNaam(),this.getLeeftijd(),this.getLengte());
    }
}
