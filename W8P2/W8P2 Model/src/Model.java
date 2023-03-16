import Personen.Adres;
import Personen.Maten;
import Personen.Persoon;

/**
 * @author Van Elias De Hondt
 * 21/11/2022
 */
public class Model extends Persoon {
    // Attributen
    private Maten maten;
    private Adres adres;
    // Constructors
    public Model(String naam, int Borstomtrek, int heupomtrek, int taille) {
        super(naam);
        this.maten = new Maten(Borstomtrek,heupomtrek,taille);
        this.adres = null;
    }
    public Model(String naam) { // Default Constructor
        super(naam);
        this.maten = new Maten();
        this.adres = null;
    }
    // Methode
    public int getBorstomtrek() { // Get..
        return maten.getBorstomtrek();
    }
    public int getHeupomtrek() { // Get..
        return maten.getHeupomtrek();
    }
    public int getTaille() { // Get..
        return maten.getTaille();
    }
    public Adres getAdres() {
        return adres;
    }
    public void setAdres(Adres adres) {
        this.adres = adres;
    }
    @Override
    public String toString() { // toString
        return String.format("%s%s%s",
                super.toString(),(adres==null)?"Adres: onbekend\n":adres.toString(),maten.toString());
    }
}
