/**
 * Van Elias De Hondt
 * 5/12/2022
 */
public class VliegtuigType {
    // Attributen
    private String code;
    private String omschrijving;
    // Constructors
    public VliegtuigType(String code, String omschrijving) {
        this.code = code;
        this.omschrijving = omschrijving;
    }
    // Methode
    public void setCode(String code) { // Set..
        this.code = code;
    }
    public void setOmschrijving(String omschrijving) { // Set..
        this.omschrijving = omschrijving;
    }
    public String getCode() { // Get..
        return code;
    }
    public String getOmschrijving() { // Get..
        return omschrijving;
    }
    @Override
    public String toString() {
        return "VliegtuigType{" +
                "code='" + code + '\'' +
                ", omschrijving='" + omschrijving + '\'' +
                '}';
    }
}
