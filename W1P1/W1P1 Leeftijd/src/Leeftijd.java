import java.time.LocalDate;
import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 19/09/2022
 */
public class Leeftijd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Vraagt de naam.
        System.out.print("Wat is je naam? ");
        String naam = keyboard.nextLine();
        // Vraagt je geboortejaar.
        System.out.print("Beste " + naam + ", geef je geboortejaar: ");
        int geboortejaar = keyboard.nextInt();
        // import LocalDate (De datum[jaar] van de OS).
        int jaar = LocalDate.now().getYear();
        // Doet jaar min geboortejaar in leeftijd.
        int leeftijd = jaar - geboortejaar;
        // Print leeftijd.
        System.out.println("Als alles goed loopt word je dit jaar " + leeftijd);
    }
}