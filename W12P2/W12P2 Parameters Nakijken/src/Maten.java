/**
 * Van Elias De Hondt
 * 21/11/2022
 */
public class Maten {
    // Attributen
    private int borstomtrek;
    private int heupomtrek;
    private int taille;
    // Constructors
    public Maten(int borstomtrek, int heupomtrek, int taille) {
        if (borstomtrek >= 200 || heupomtrek >= 200 || taille >= 200) {
            throw new IllegalArgumentException("Foutieve waarde [borstomtrek, heupomtrek, taille]…");
        }
        if (borstomtrek <= 0 || heupomtrek <= 0 || taille <= 0) {
            throw new IllegalArgumentException("Foutieve waarde [borstomtrek, heupomtrek, taille]…");
        }
        this.borstomtrek = borstomtrek;
        this.heupomtrek = heupomtrek;
        this.taille = taille;
    }
    public Maten() { // Default Constructor
        this.borstomtrek = 90;
        this.heupomtrek = 60;
        this.taille = 90;
    }
    // Methode
    public int getBorstomtrek() { // Get..
        return borstomtrek;
    }
    public int getHeupomtrek() { // Get..
        return heupomtrek;
    }
    public int getTaille() { // Get..
        return taille;
    }
    @Override
    public String toString() { // toString
        return String.format("Maten: %d %d %d",
                this.getBorstomtrek(),this.getHeupomtrek(),this.getTaille());
    }
}
