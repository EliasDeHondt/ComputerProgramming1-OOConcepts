import java.util.Scanner;

/**
 @author Elias De Hondt
 * 26/09/2022
 */
public class Pasen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Hier worden een paar variabelen gedefinieerd.
        System.out.print("Geef een jaartal: ");
        int jaar = keyboard.nextInt();
        // Als het jaartal lager is als 1583.
        if (jaar < 1583) {
            System.out.println("Het jaartal moet groter of gelijk zijn aan 1583!");
        }
        // Als het jaartal hoger is als 1583.
        if (jaar >= 1583) {
            //--------------------------------------------------------------------------------------
            // Een algoritme niet gemaakt door mij dit stand in de opdracht.
            int n = jaar % 19;
            int c = jaar / 100;
            int u = jaar % 100;
            int s = c / 4;
            int t = c % 4;
            int p = (c + 8) / 25;
            int q = (c - p + 1) / 3;
            int e = (19 * n + c - s - q + 15) % 30;
            int b = u / 4;
            int d = u % 4;
            int L = (2 * t + 2 * b - e - d + 32) % 7;
            int h = (n + 11 * e + 22 * L) / 451;
            int maand = (e + L -7 * h + 114) / 31;
            int dag = ((e + L -7 * h + 114) % 31) + 1;
            //--------------------------------------------------------------------------------------
            System.out.println("In " + jaar + " valt Pasen op " + dag + " " + maand + ".");
        }

    }
}
