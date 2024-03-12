import ArtikelLijn;
import Boek;
import Film;
import Winkelmandje;

/**
 @author Elias De Hondt
 * 5/12/2022
 */
public class Test {
    // Methode
    public static void main(String[] args) {
        Boek boek = new Boek("B1011", 32.49, "Titel", "auteur1");
        boek.voegAuteurToe("auteur2");
        Film film = new Film("F0125", 15.95, "Filmtitel", "acteur1");
        film.voegActeurToe("acteur2");
        film.voegActeurToe("acteur3");
        Winkelmandje winkelmandje = new Winkelmandje();
        winkelmandje.voegArtikelToe(boek, 2);
        winkelmandje.voegArtikelToe(film, 1);
        System.out.println("winkelmandje volgens id:");
        System.out.printf("%-8s%-60s%-8s%-6s\n", "nummer", "beschrijving", "aantal", "totaal");
        for(ArtikelLijn artikelLijn : winkelmandje.artikelenVolgensId()) {
            System.out.println(artikelLijn);
        }
        System.out.println("TOTAAL: " + winkelmandje.getPrijs() + " EUR");
        System.out.println("winkelmandje volgens naam:");
        System.out.printf("%-8s%-60s%-8s%-6s\n", "nummer", "beschrijving", "aantal", "totaal");
        for(ArtikelLijn artikelLijn : winkelmandje.artikelenVolgensNaam()) {
            System.out.println(artikelLijn);
        }
        System.out.println("TOTAAL: " + winkelmandje.getPrijs() + " EUR");
        System.out.println("winkelmandje volgens prijs:");
        System.out.printf("%-8s%-60s%-8s%-6s\n", "nummer", "beschrijving", "aantal", "totaal");
        for(ArtikelLijn artikelLijn : winkelmandje.artikelenVolgensPrijs()) {
            System.out.println(artikelLijn);
        }
        System.out.println("TOTAAL: " + winkelmandje.getPrijs() + " EUR");
    }
}
