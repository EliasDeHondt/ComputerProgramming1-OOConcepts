/**
 @author Van Elias De Hondt
 * 24/11/2022
 */
public class Telefoon {
    // Attributen
    private String nummer;
    // Constructors
    public Telefoon(String nummer) {
        this.nummer = nummer;
    }
    // Methode
    @Override
    public String toString() { // @Override van toString
        return String.format("Tel: %s",this.nummer);
    }
}
