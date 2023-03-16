import java.util.Scanner;

/**
 * @author Elias De Hondt
 * 26/09/2022
 */
public class Korting {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Hier worden er vragen gesteld voor de input van het programma.
        System.out.print("Geef het bedrag: ");
        int bedrag = keyboard.nextInt();
        System.out.print("Geef het aantal artikelen: ");
        int aantal = keyboard.nextInt();
        // Het bedrag moet gelijk zijn aan 150 of groter.
        // En het aantal moet gelijk zijn aan 10 of 20 of daar tussen.
        if (bedrag >= 150 && (aantal >= 10 && aantal <= 20 )) {
            System.out.println("De klant krijgt WEL korting");
        }
        // De klant krijgt ook korting wanneer het aantal producten hoger is als 100 of gelijk aan 100.
        else if (aantal >= 100) {
            System.out.println("De klant krijgt WEL korting");
        }
        // Als bovenstaande criteria niet waar zijn.
        else {
            System.out.println("De klant krijgt GEEN korting");
        }
    }
}
