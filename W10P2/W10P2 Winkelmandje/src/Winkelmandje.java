import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 @author Elias De Hondt
 * 5/12/2022
 */
public class Winkelmandje {
    // Attributen
    private List<ArtikelLijn> artikelLijnen;
    // Constructors
    public Winkelmandje() {
        artikelLijnen = new ArrayList<>();
    }
    public void voegArtikelToe(Artikel newArtikel, int aantal) {
        this.artikelLijnen.add(new ArtikelLijn(newArtikel,aantal));
    }
    public void verwijderArtikel(Artikel artikel) {
        for (Iterator<ArtikelLijn> it = artikelLijnen.iterator(); it.hasNext();) {
            Artikel tempArtikel = it.next().getArtikel();
            if (artikel.getId().equals(tempArtikel.getId())) {
                it.remove();
            }
        }
    }
    public double getPrijs() {
        double WinkelmandjePrijs = 0.0;
        for (ArtikelLijn artikelLijn : artikelLijnen) {
            WinkelmandjePrijs = + artikelLijn.getPrijs();
        }
        return WinkelmandjePrijs;
    }
    // Methode
    @Override
    public String toString() { // @Override van toString
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("nummer  beschrijving                                                aantal  totaal\n");
        for (ArtikelLijn artikelLijn : artikelLijnen) {
            stringBuilder.append(artikelLijn.toString());
            stringBuilder.append("\n");
        }
        return String.format("%s",stringBuilder);
    }
}
