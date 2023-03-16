import java.util.*;

/**
 @author Van Elias De Hondt
 * 5/12/2022
 */
public class Winkelmandje {
    // Attributen
    private Set<ArtikelLijn> artikelLijnen;
    // Constructors
    public Winkelmandje() {
        artikelLijnen = new HashSet<>();
    }
    // Methode
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
        double winkelmandjePrijs = 0.0;
        for (ArtikelLijn artikelLijn : artikelLijnen) {
            winkelmandjePrijs += artikelLijn.getPrijs();
        }
        return winkelmandjePrijs;
    }
    public List<ArtikelLijn> artikelenVolgensId() {
        List<ArtikelLijn> idList = new ArrayList<>(this.artikelLijnen); // artikelLijnen = idList
        Collections.sort(idList, new Comparator<ArtikelLijn>() {
            @Override
            public int compare(ArtikelLijn o1, ArtikelLijn o2) {
                return o1.getArtikel().getId().compareTo(o2.getArtikel().getId());
            }
        });
        return idList;
    }
    public List<ArtikelLijn> artikelenVolgensNaam() {
        List<ArtikelLijn> naamList = new ArrayList<>(this.artikelLijnen); // artikelLijnen = naamList
        Collections.sort(naamList, new Comparator<ArtikelLijn>() {
            @Override
            public int compare(ArtikelLijn o1, ArtikelLijn o2) {
                return o1.getArtikel().compareTo(o2.getArtikel());
            }
        });
        return naamList;
    }
    public List<ArtikelLijn> artikelenVolgensPrijs() {
        List<ArtikelLijn> PrijsList = new ArrayList<>(this.artikelLijnen); // artikelLijnen = PrijsList
        Collections.sort(PrijsList, new Comparator<ArtikelLijn>() {
            @Override
            public int compare(ArtikelLijn o1, ArtikelLijn o2) {
                return (int) (o1.getArtikel().getPrijs() - o2.getArtikel().getPrijs());
            }
        });
        return PrijsList;
    }
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
