import java.util.Objects;

/**
 @author Elias De Hondt
 * 5/12/2022
 */
public class Acteur {
    // Attributen
    private String naam;
    private int geboortejaar;
    // Constructors
    public Acteur(String naam, int geboortejaar) {
        this.naam = naam;
        this.geboortejaar = geboortejaar;
    }
    // Methode
    public String getNaam() {
        return naam;
    }
    public int getGeboortejaar() {
        return geboortejaar;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Acteur acteur)) return false;

        if (geboortejaar != acteur.geboortejaar) return false;
        return Objects.equals(naam, acteur.naam);
    }
    @Override
    public int hashCode() {
        int result = naam != null ? naam.hashCode() : 0;
        result = 31 * result + geboortejaar;
        return result;
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("%d %s",this.geboortejaar,this.naam);
    }
}
