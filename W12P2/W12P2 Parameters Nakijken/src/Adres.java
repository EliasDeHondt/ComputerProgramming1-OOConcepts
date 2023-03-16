/**
 @author Van Elias De Hondt
 * 21/11/2022
 */
public class Adres {
    // Attributen
    private String straatNr;
    private int postCode;
    // Constructors
    public Adres(String straatNr, int postCode) {
        if (straatNr == null || straatNr.isEmpty()) {
            throw new IllegalArgumentException("Foutieve waarde [straatNr]…");
        }
        this.straatNr = straatNr;
        if (postCode <= 0 || postCode > 9999) {
            throw new IllegalArgumentException("Foutieve waarde [postCode]…");
        }
        this.postCode = postCode;
    }
    // Methode
    public String getStraatNr() { // Get..
        return this.straatNr;
    }
    public int getPostCode() { // Get..
        return this.postCode;
    }
    @Override
    public String toString() { // toString
        return String.format("Adres: %s, %d\n",this.getStraatNr(),this.getPostCode());
    }
}
