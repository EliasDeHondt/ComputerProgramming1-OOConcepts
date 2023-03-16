/**
 @author Van Elias De Hondt
 * 8/12/2022
 */
public class testLottoGetallen {
    // Attributen
    // Constructors
    // Methode
/**
 * De klasse TestLottoGetallen maakt via de constructor een nieuw
 * LottoGetallen-object. Voer 40 keer na mekaar de methode
 * genereerLottoGetallen uit en toon de getallen telkens op één
 * regel door gebruik te maken van de methode toonLottoGetallen.
 */
public static void main(String[] args) {
    LottoGetallen getallen = new LottoGetallen();
    for (int i = 0; i < 10; i++) {
        getallen.genereerLottoGetallen();
        System.out.println(getallen.toonLottoGetallen());
    }
}
}
