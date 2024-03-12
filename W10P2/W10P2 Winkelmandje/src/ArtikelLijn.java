/**
 @author Elias De Hondt
 * 5/12/2022
 */
public class ArtikelLijn {
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
    public String toString() { // @Override van toString
        return String.format("%-70s %-3d %.2f EUR",this.getArtikel(),this.getAantal(),this.getPrijs());
    }
}
