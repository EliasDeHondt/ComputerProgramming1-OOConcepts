import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 22/09/2022
 */
public class BMI {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Wat is je naam?
        System.out.print("Wat is je naam? ");
        String naam = keyboard.nextLine();
        // Programma stelt zich voor.
        System.out.println("Beste " + naam + ", dit programma berekent je BMI.");
        // Wat is je gewicht?
        System.out.print("Geef je gewicht in kilogram: ");
        double gewicht = keyboard.nextDouble();
        // Wat is je lengte?
        System.out.print("Geef je lengte in meters: ");
        double lengte = keyboard.nextDouble();
        // BMI berekenen.
        double BMI = gewicht / (lengte * lengte);
        // Dit is je BMI.
        System.out.println("Je BMI is: " + BMI);
        // BMI = ondergewicht
        if (BMI <= 18) {
            System.out.println("Dat is ondergewicht.");
        }
        // BMI = in orde
        if (BMI > 18 && BMI < 25) {
            System.out.println("Dat is in orde.");
        }
        // BMI = overgewicht
        if (BMI > 25 && BMI < 30) {
            System.out.println("Dat is overgewicht.");
        }
        // BMI = obesitas
        if (BMI >= 30) {
            System.out.println("Dat is obesitas.");
        }
    }
}
