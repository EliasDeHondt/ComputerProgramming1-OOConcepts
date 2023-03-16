/**
 @author Van Elias De Hondt
 * 5/12/2022
 */
public class Vliegtuig {
    // Attributen
    private VliegtuigType type;
    private String maatschappij;
    private String naam;
    // Constructors
    public Vliegtuig(VliegtuigType type, String maatschappij, String naam) {
        this.type = type;
        this.maatschappij = maatschappij;
        this.naam = naam;
    }
    // Methode
    public VliegtuigType getType() { // Get..
        return type;
    }
    public String getMaatschappij() { // Get..
        return maatschappij;
    }
    public String getNaam() { // Get..
        return naam;
    }
    @Override
    public String toString() {
        return "Vliegtuig{" +
                "type=" + type +
                ", maatschappij='" + maatschappij + '\'' +
                ", naam='" + naam + '\'' +
                '}';
    }
}
