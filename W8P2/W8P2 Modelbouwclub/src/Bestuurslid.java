/**
 * Van Elias De Hondt
 * 24/11/2022
 */
public class Bestuurslid extends Lid {
    // Attributen
    private String functie;
    // Constructors
    public Bestuurslid(String naam, long nummer, String functie) {
        super(naam, nummer);
        this.functie = functie;
    }
    // Methode
    public String getFunctie() {
        return functie;
    }
    @Override
    public boolean equals(Object object) {
        Bestuurslid other = (Bestuurslid)object;
        if (super.getNaam().equals(other.getNaam())
                && super.getNummer() == other.getNummer()
                && this.getFunctie().equals(other.getFunctie())) return true;
        else return false;
    }
    @Override
    public int hashCode() {
        return (int)super.getNummer();
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("bestuurslid %s", super.toString());
    }
}
