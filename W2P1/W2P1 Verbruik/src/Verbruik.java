import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 26/09/2022
 */
public class Verbruik {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Hier worden er vragen gesteld voor de input van het programma.
        System.out.print("Geef de vorige kilometerstand: ");
        int vorigeKilometerstand = keyboard.nextInt();
        System.out.print("Geef de huidige kilometerstand:" );
        int huidigeKilometerstand = keyboard.nextInt();
        System.out.print("Geef het aantal getankte liters: ");
        // Hier wordt de berekening gemaakt voor de output.
        double aantalGetankte = keyboard.nextDouble();
        int afstand = huidigeKilometerstand - vorigeKilometerstand;
        double liters = (aantalGetankte * 100) / afstand;
        // Hier wordt de output afgeprint.
        System.out.println("Verbruik voor " + afstand + "km " + liters + " liter/100km");
    }
}
