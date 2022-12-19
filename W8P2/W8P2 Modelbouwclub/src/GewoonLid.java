/**
 * Van Elias De Hondt
 * 24/11/2022
 */
public class GewoonLid extends Lid{
    // Attributen
    private String specialiteil;
    // Constructors
    public GewoonLid(String naam, long nummer, String specialiteil) {
        super(naam, nummer);
        this.specialiteil = specialiteil;
    }
    public String getSpecialiteil() { // Get..
        return specialiteil;
    }
    // Methode
    @Override
    public String toString() { // @Override van toString
        return String.format("GewoonLid %s",super.toString());
    }
}
