/**
 * Van Elias De Hondt
 * 5/12/2022
 */
public class Test {
    // Attributen
    // Constructors
    // Methode
    public static void main(String[] args) {
        Boek boek = new Boek("B1011", 23, "Liefde op de savanne", "Anne Jacobs");
        Film film = new Film("F0125", 15.95, "Close", "Eden Dambrine");
        film.voegActeurToe("Gustav De Waele");
        film.voegActeurToe("Emilie Dequenne");

        Winkelmandje winkelmandje = new Winkelmandje();
        winkelmandje.voegArtikelToe(boek, 2);
        winkelmandje.voegArtikelToe(film, 1);
        System.out.println("winkelmandje:\n" + winkelmandje);
        System.out.println("TOTAAL: " + winkelmandje.getPrijs() + " EUR");
        winkelmandje.verwijderArtikel(boek);
        System.out.println("\nwinkelmandje na verwijderen:\n" + winkelmandje);
        System.out.println("TOTAAL: " + winkelmandje.getPrijs() + " EUR");
    }
}
