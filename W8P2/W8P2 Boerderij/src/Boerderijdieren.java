/**
 * Van Elias De Hondt
 * 21/11/2022
 */
public class Boerderijdieren {
    // Attributen
    private String naam;
    private String geluid;
    private String voeding;
    // Constructors
    public Boerderijdieren(String naam, String geluid, String voeding) {
        this.naam = naam;
        this.geluid = geluid;
        this.voeding = voeding;
    }
    // Methode
    public String getNaam() { // Get..
        return naam;
    }
    public String getGeluid() { // Get..
        return geluid;
    }
    public String getVoeding() { // Get..
        return voeding;
    }
    @Override
    public String toString() {
        return String.format("%s maakt geluid %s en eet %s",
                this.naam,this.geluid,this.voeding);
    }
}
