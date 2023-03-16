import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 26/09/2022
 */
public class Schrikkeljaar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Hier worden er vragen gesteld voor de input van het programma.
        System.out.print("Geef een jaartal:");
        int jaartal = keyboard.nextInt();
        // Als het jaar deelbaar is door 400 en gelijk is aan 2000 of kleinder is als 2000 is het een schrikkeljaar.
        // OR
        // Als het jaar deelbaar is door 4 of groter is als 2000 is het een schrikkeljaar.
        if ((jaartal % 400) == 0 && (jaartal <= 2000) || (jaartal % 4) == 0 && (jaartal > 2000) ) {
            System.out.println("Het jaar " + jaartal + " is een schrikkeljaar.");
        }
        // Als bovenstaande criteria foutief zijn.
        else {
            System.out.println("Het jaar " + jaartal + " is geen schrikkeljaar.");
        }
    }
}
