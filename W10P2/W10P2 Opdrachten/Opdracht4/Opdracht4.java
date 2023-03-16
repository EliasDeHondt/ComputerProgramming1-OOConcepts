/**
 @author Van Elias De Hondt
 * 8/12/2022
 */
public class Opdracht4 implements Comparable<Opdracht4>{
    // Attributen
    private String naam;
    private int leeftijd;
    private double lengte;
    // Constructors
    public Opdracht4(String naam, int leeftijd, double lengte) {
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
    public int compareTo(Opdracht4 tempKind) {
//        return this.getNaam().compareTo(tempKind.getNaam()); // A-Z
//        return this.getNaam().compareTo(tempKind.getNaam()); // Z-A
//        return (int)(this.getLengte() - tempKind.getLengte()*100);
        return Double.compare(this.getLengte(), tempKind.getLengte());
//        return this.getLeeftijd() - tempKind.getLeeftijd();
    }
}
