/**
 * Van Elias De Hondt
 * 5/12/2022
 */
public class Drank {
    // Attributen
    private String naam;
    private double prijs;
    private boolean alcoholisch;
    // Constructors
    public Drank(String naam, double prijs, boolean alcoholisch) {
        this.naam = naam;
        this.prijs = prijs;
        this.alcoholisch = alcoholisch;
    }
    // Methode
    public void setNaam(String naam) { // Set..
        this.naam = naam;
    }
    public void setPrijs(double prijs) { // Set..
        this.prijs = prijs;
    }
    public String getNaam() { // Get..
        return naam;
    }
    public double getPrijs() { // Get..
        return prijs;
    }
    public boolean isAlcoholisch() {
        return this.alcoholisch;
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("%s €%.2f",this.getNaam(),this.getPrijs());
    }
}
