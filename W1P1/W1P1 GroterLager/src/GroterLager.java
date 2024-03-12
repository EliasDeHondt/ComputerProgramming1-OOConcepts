import java.util.Random;
import java.util.Scanner;

/**
 @author Elias De Hondt
 * 22/09/2022
 */
public class GroterLager {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Random getal van 50 tot 100 in var random
        Random random = new Random();
        int TeZoekenGetal = random.nextInt(50, 101); //50..100
        // teller is gelijk aan 0 en ook gok is gelijk aan 0
        int teller = 0, gok = 0;
        // Het begin van de while loop (Het is een loop!)
        // Het stop wanneer gok niet gekijk is aan TeZoekenGetal
        while (gok != TeZoekenGetal) {
            teller = teller + 1;
            System.out.print("Geef een getal: ");
            gok = keyboard.nextInt();
            // Als gok gelijk is aan TeZoekenGetal dan ...
            if (gok == TeZoekenGetal) {
                System.out.println("Proficiat u hebt het geraden in " + teller + "beurten!");
            }
            // Als gok klijnder is dan TeZoekenGetal dan ...
            if (gok < TeZoekenGetal) {
                System.out.println("Te klijn!");
            }
            // Als gok grooter is dan TeZoekenGetal dan ....
            if (gok > TeZoekenGetal) {
                System.out.println("Te groot!");
            }
        }
    }
}
