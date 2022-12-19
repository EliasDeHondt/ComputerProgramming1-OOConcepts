import java.util.Objects;

/**
 * Van Elias De Hondt
 * 5/12/2022
 */
public class ArtikelLijn implements Comparable<ArtikelLijn>{
    // Attributen
    private Artikel artikel;
    private int aantal;
    // Constructors
    public ArtikelLijn(Artikel artikel, int aantal) {
        this.artikel = artikel;
        this.aantal = aantal;
    }
    // Methode
    public Artikel getArtikel() { // Get..
        return artikel;
    }
    public int getAantal() { // Get..
        return aantal;
    }
    public double getPrijs() { // Get..
        return this.artikel.getPrijs() * this.aantal;
    }
    public void verhoogAantal() {
        this.aantal++;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArtikelLijn that)) return false;

        return Objects.equals(artikel, that.artikel);
    }
    @Override
    public int hashCode() {
        return artikel != null ? artikel.hashCode() : 0;
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("%-70s %-3d %.2f EUR",this.getArtikel(),this.getAantal(),this.getPrijs());
    }
    @Override
    public int compareTo(ArtikelLijn TempArtikelLijn) {
        return this.artikel.compareTo(TempArtikelLijn.artikel);
    }
}
