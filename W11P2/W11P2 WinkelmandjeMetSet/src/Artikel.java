import java.util.Objects;

/**
 @author Elias De Hondt
 * 5/12/2022
 */
public abstract class Artikel implements Comparable<Artikel>{
    // Attributen
    private String id;
    private double prijs;
    // Constructors
    public Artikel(String id, double prijs) {
        this.id = id;
        this.prijs = prijs;
    }
    // Methode
    public String getId() { // Get..
        return id;
    }
    public double getPrijs() { // Get..
        return prijs;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artikel artikel)) return false;

        return Objects.equals(id, artikel.id);
    }
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
    @Override
    public int compareTo(Artikel tempArtikel) {
        return (int) (this.getPrijs() - tempArtikel.getPrijs());
    }

    public abstract int compareTo(Film o);
}
