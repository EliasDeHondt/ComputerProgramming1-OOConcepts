/**
 * Van Elias De Hondt
 * 27/10/2022
 */
public class Opdracht8 {
    public static void main(String[] args) {
        String[] dagen = {"maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"};

        // Druk de dagen in volgorde af met een for-each lus.
        for (String dag : dagen) {
            System.out.println(dag);
        }
        System.out.println("----------");
        // Druk de dagen in omgekeerde volgorde af.
        for (int i = dagen.length-1; i >= 0; i--) {
            System.out.println(dagen[i]);
        }
        System.out.println("----------");
        // Druk vervolgens op één regel de "weekenddagen" uit de array af, ditmaal zonder een lus te gebruiken.
        System.out.println(dagen[5] + " en " + dagen[6]);
        System.out.println("----------");
        // Druk telkens de eerste twee hoofdletters van de dagen van de week af. Maak gebruik van een for-each lus (MA DI WO DO VR ZA ZO).
        for (String dag : dagen) {
            System.out.printf("%s%s ", dag.toUpperCase().charAt(0), dag.toUpperCase().charAt(1));
        }
    }
}
