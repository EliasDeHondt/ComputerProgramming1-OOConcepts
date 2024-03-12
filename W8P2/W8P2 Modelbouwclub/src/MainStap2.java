/**
 @author Elias De Hondt
 * 24/11/2022
 */
public class MainStap2 {
    // Methode
    public static void main(String[] args) {
        Lid lid1 = new Lid("Kris", 123456);
        Lid lid2 = new Lid("Mark", 123456);
        if (lid1.equals(lid2)) {
            System.out.printf("De leden %s en %s zijn gelijk\n", lid1, lid2);
        } else {
            System.out.printf("De leden %s en %s zijn niet gelijk\n", lid1, lid2);
        }

        Lid lid3 = new Bestuurslid("Piet", 456789, "penningmeester");
        Lid lid4 = new Bestuurslid("Joris", 456789, "voorzitter");
        if (lid3.equals(lid4)) {
            System.out.printf("De leden %s en %s zijn gelijk\n", lid3, lid4);
        } else {
            System.out.printf("De leden %s en %s zijn niet gelijk\n", lid3, lid4);
        }
    }
}
