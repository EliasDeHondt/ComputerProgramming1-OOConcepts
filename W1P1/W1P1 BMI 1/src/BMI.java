import java.util.Scanner;

/**
 * @author Van Elias De Hondt
 * 19/09/2022
 */
public class BMI {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Wat is je naam?
        System.out.print("Wat is je naam? ");
        String naam = keyboard.nextLine();
        // Programma stelt zich voor.
        System.out.print("Beste " + naam + ", dit programma berkent je BMI.");
        // Wat si je gewicht?
        System.out.print("Geef je gewicht in kilogram: ");
        double gewicht = keyboard.nextDouble();
        // Wat si je lengte?
        System.out.print("Geef je lengte in meters: ");
        double lengte = keyboard.nextDouble();
        // BMI berekenen.
        double BMI = gewicht / (lengte * lengte);
        // Dit is je BMI.
        System.out.print("Je BMI is:" + BMI);
    }
}
