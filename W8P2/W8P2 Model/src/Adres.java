/**
 * @author Elias De Hondt
 * 21/11/2022
 */
public class Adres {
    // Attributen
    private String straatNr;
    private int postCode;
    // Constructors
    public Adres(String straatNr, int postCode) {
        this.straatNr = straatNr;
        this.postCode = postCode;
    }
    // Methode
    public String getStraatNr() { // Get..
        return straatNr;
    }
    public int getPostCode() { // Get..
        return postCode;
    }
    @Override
    public String toString() { // toString
        return String.format("Adres: %s, %d\n",
                this.getStraatNr(),this.getPostCode());
    }
}
