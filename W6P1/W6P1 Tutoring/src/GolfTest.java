import golven.Golf;
import golven.GolvenGrafiek;

import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 28/10/2022
 */
public class GolfTest {
    // Methode
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Golf golf = new Golf();
        System.out.print("Wat is het aantal golven? ");
        GolvenGrafiek golvenGrafiek = new GolvenGrafiek(key.nextInt());
        golvenGrafiek.maakGolven();
        golvenGrafiek.tekenGolven();
    }
}
