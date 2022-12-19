/**
 * Van Elias De Hondt
 * 8/12/2022
 */
public class Opdracht5 implements Comparable<Opdracht5>{
    // Attributen
    private String naam;
    private int leeftijd;
    private double lengte;
    // Constructors
    public Opdracht5(String naam, int leeftijd, double lengte) {
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
    @Override
    public int compareTo(Opdracht5 tempKind) {
        return this.naam.compareTo(tempKind.getNaam());
    }
}
