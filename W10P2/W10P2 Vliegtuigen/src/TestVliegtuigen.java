import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 @author Elias De Hondt
 * 5/12/2022
 */
public class TestVliegtuigen {
    // Attributen
    // Constructors
    // Methode
    public static void main(String[] args) {
        Vliegtuig v1 = new Vliegtuig(new VliegtuigType("A345", "Airbus A340-541"), "A6-EHD", "Etihad Airways");
        Vliegtuig v2 = new Vliegtuig(new VliegtuigType("B739", "Boeing 737-9K2"), "PH-BXR", "KLM");
        Vliegtuig v3 = new Vliegtuig(new VliegtuigType("B748", "Boeing 747-830"), "D-ABYQ", "Lufthansa");
        Vliegtuig v4 = new Vliegtuig(new VliegtuigType("A333", "Airbus A330-323X"), "N820NW", "Delta Air Lines");
        Vliegtuig v5 = new Vliegtuig(new VliegtuigType("A333", "Airbus A330-343X"), "C-GFAJ", "Air Canada");

        // 1.
        // Maak een variabele lijst van het type List<Vliegtuig> en initialiseer deze variabele als ArrayList
        List<Vliegtuig> lijst = new ArrayList<>();

        // 2.
        // Voeg de vijf vliegtuigen toe aan je lijst.
        lijst.add(v1);
        lijst.add(v2);
        lijst.add(v3);
        lijst.add(v4);
        lijst.add(v5);

        // 3.
        // Gebruik een for-each lus om elk element uit je lijst af te drukken op het scherm.
        for (Vliegtuig v : lijst) {
            System.out.println(v);
        }

        System.out.println(); // lege lijn...

        // 4.
        // Gebruik een iterator om je lijst te overlopen. Als je een vliegtuig van KLM
        // tegenkomnt, verwijder dit dan met behulp van de iterator.
        for (Iterator<Vliegtuig> it = lijst.iterator(); it.hasNext(); ) {
            Vliegtuig vliegtuig = it.next();
            if (vliegtuig.getNaam().equals("KLM")) {
                it.remove();
            }
        }

        // 5.
        // Gebruik een for-each lus om elk element uit je lijst af te drukken op het scherm.
        for (Vliegtuig v : lijst) {
            System.out.println(v);
        }
    }
}
