/**
 @author Van Elias De Hondt
 * 24/11/2022
 */
public class MainStap1 {
    // Methode
    public static void main(String[] args) {
        Lid lid1 = new Lid("Kris", 123456);
        Lid lid2 = new Lid("Mark", 123456);
        if (lid1.equals(lid2)) {
            System.out.printf("De leden %s en %s zijn gelijk\n", lid1, lid2);
        } else {
            System.out.printf("De leden %s en %s zijn niet gelijk\n", lid1, lid2);
        }
    }

}
