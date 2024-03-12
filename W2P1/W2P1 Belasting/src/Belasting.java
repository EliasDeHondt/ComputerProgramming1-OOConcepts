import java.util.Scanner;

/**
 @author Elias De Hondt
 * 26/09/2022
 */
public class Belasting {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double inclusief = 0;
        double exclusief = 0;
        System.out.print("Geef het BTW percentage: ");
        double btw = keyboard.nextDouble();
        System.out.print("Geef het bedrag in €: ");
        double bedrag = keyboard.nextDouble();
        System.out.print("Maak je keuze (1 = inclusief, 2 = exclusief): ");
        int keuze = keyboard.nextInt();
        if (keuze == 1) {
            inclusief = bedrag;
            exclusief = bedrag - btw;
            System.out.println(exclusief + " + " + btw + "% BTW = " + inclusief);
        }
        else if (keuze == 2) {
            inclusief = btw + bedrag;
            System.out.println(bedrag + " + " + btw + "% BTW = " + inclusief);
        }
        else {
            System.out.println("Foutieve keuze!");
        }
    }
}
