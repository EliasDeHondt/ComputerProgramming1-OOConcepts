import formulas.Graphic;

import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 20/10/2022
 */
public class Calculator {
    public static void main(String[] args) {
        // =============================================================================================================
        // Wat is de minimum, maximum en curve dat je wil.
        Scanner key = new Scanner(System.in);
        System.out.print("Geef de minimum waarde: ");
        double minimum = key.nextDouble();
        System.out.print("Geef de maximum waarde: ");
        double maximum = key.nextDouble();
        System.out.print("Welke curve wil je tekenen?\n1 = sinus\n2 = cosinus hyperbolicus\n3 = wortel\nJouw keuze: ");
        int keuze = key.nextInt();
        Graphic graphic = new Graphic(minimum, maximum);
        // =============================================================================================================
        // Hier wordt de gevraagde grafiek afgeprint.
        switch (keuze) {
            case 1 -> System.out.println(graphic.getSinus());
            case 2 -> System.out.println(graphic.getCosinusHyberbolicus());
            case 3 -> System.out.println(graphic.getWortel());
        }
        // =============================================================================================================
    }
}
