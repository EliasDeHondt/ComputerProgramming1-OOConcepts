import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 @author Van Elias De Hondt
 * 8/12/2022
 */
public class RunVerjaardag {
    // Attributen
    // Constructors
    // Methode
    public static void main(String[] args) {
        Persoon[] data = {
                new Persoon("Jeremy", new Datum(16, Datum.Maand.MEI)),
                new Persoon("Bo", 9, Datum.Maand.DECEMBER),
                new Persoon("Evelyne", 15, Datum.Maand.AUGUSTUS),
                new Persoon("Jeremy", 23, Datum.Maand.AUGUSTUS),
                new Persoon("Divine", new Datum(25, Datum.Maand.APRIL)),
                new Persoon("Ayoub", 15, Datum.Maand.AUGUSTUS),
                new Persoon("Jeremy", 3, Datum.Maand.AUGUSTUS),
                new Persoon("Divine", 10, Datum.Maand.APRIL)
        };
        List<Persoon> personen = new ArrayList<Persoon>(Arrays.asList(data));
        toonPersonen(personen);
        // Sorteer personen in volgorde van de kalender
        personen.sort(new Persoon.DatumComparator());
        System.out.println("\nGesorteerd op verjaardag:");
        toonPersonen(personen);
        // Sorteer personen alfabetisch
        Collections.sort(personen);
        System.out.println("\nGesorteerd op naam:");
        toonPersonen(personen);
    }
    private static void toonPersonen(List<Persoon> personen) {
        for (Persoon persoon : personen) {
            System.out.println(persoon);
        }
    }
}
