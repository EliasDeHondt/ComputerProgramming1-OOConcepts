/**
 * Van Elias De Hondt
 * 20/12/2022
 */
public class Geschenk {
    // Attributes
    private String geschenkNaam;
    private double prijs;
    private String koper;
    // Constructors
    public Geschenk(String naam, double prijs) {
        this.setGeschenkNaam(naam);
        this.setPrijs(prijs);
    }
    // Methods
    public void setGeschenkNaam(String geschenkNaam) { // Set..
        if (geschenkNaam.isEmpty()) throw new GeschenkExceptien("Lege naam.");
        else this.geschenkNaam = geschenkNaam;
    }
    public void setPrijs(double prijs) { // Set..
        if (prijs < 0) throw new GeschenkExceptien("Negatieve prijs.");
        else this.prijs = prijs;
    }
    public void setKoper(String koper) { // Set..
        if (koper.isEmpty()) throw new GeschenkExceptien("Lege naam van koper.");
        else this.koper = koper;
    }
    public String getGeschenkNaam() { // Get..
        return this.geschenkNaam;
    }
    public double getPrijs() { // Get..
        return this.prijs;
    }
    public String getKoper() { // Get..
        return this.koper;
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("%s %-6.2f %s\n",this.getGeschenkNaam(),this.getPrijs(),this.getKoper());
    }
}
