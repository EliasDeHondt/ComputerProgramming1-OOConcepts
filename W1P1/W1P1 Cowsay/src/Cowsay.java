import java.util.Objects;
import java.util.Scanner;

/**
 * @author Elias De Hondt
 * 22/09/2022
 */
public class Cowsay {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Hier geven we de variabelen "nogis" de waarden "j".
        String nogis = "j";
        // Hier geven we de variabelen "dier" de waarden "0".
        int dier = 0;
        // Hier wordt de naam gevraagd van de gebruiker van het spel.
        System.out.print("Goedendag wat is uw naam? ");
        String naam = keyboard.nextLine();
        // Hier wordt het spel voorgesteld aan de gebruiker en ook de vraag gesteld met welk dier ze willen praten.
        System.out.println("Hallo " + naam + ", En welkom bij mijn spel ik heb twee dieren die ik kan laten spreken.");
        // Hier begint de eerste while loop want het spel kan meerdere keren op nieuw gespeeld worden.
        while (Objects.equals(nogis, "j")) {
            // Als de gebruiker op "1" drukt kan hij de koe laten praten.
            System.out.println("\t1" + " De Koe.");
            // Als de gebruiker op "2" drukt kan hij de pinguïn laten praten.
            System.out.println("\t2" + " De pinguïn.");
            // In de variabele "dier" wordt de nummer "1" of "2" opgeslagen voor de if statement aan te sturen.
            dier = keyboard.nextInt();
            keyboard.nextLine();
            // Dit is de eerste if statement deze wordt geactiveerd wanneer de variabele "dier" op "1" staat.
            if (dier == 1) {
                // Vraagt welke zin het dier moet spreken.
                System.out.print("Welke zin wil je onze koe laten zeggen? ");
                String zin = keyboard.nextLine();
                System.out.println("-------------------------------------------");
                // Print de zin af van het dier.
                System.out.println(" < " + zin + " > ");
                System.out.println("-------------------------------------------");
                System.out.println("    \\   ^__^                              -");
                System.out.println("     \\  (oo)\\_______                      -");
                System.out.println("        (__)\\       )\\/\\                  -");
                System.out.println("          U ||----w |                     -");
                System.out.println("            ||      ||                    -");
                System.out.println("-------------------------------------------");
                // Hier wordt er gevraagd of dat je het spel opnieuw wilt spelen dit wordt opgeslagen in variabele "nogis".
                System.out.print("Wil je de koe nog iets laten zeggen? (j/n) ");
                nogis = keyboard.nextLine();
            }
            // Dit is de tweede if statement deze wordt geactiveerd wanneer de variabele "dier" op "2" staat.
            if (dier == 2) {
                // Vraagt welke zin het dier moet spreken.
                System.out.print("Welke zin wil je onze pinguïn laten zeggen? ");
                String zin = keyboard.nextLine();
                System.out.println("-------------------------------------------");
                // Print de zin af van het dier.
                System.out.println(" < " + zin + " > ");
                System.out.println("-------------------------------------------");
                System.out.println("   \\                                      -");
                System.out.println("    \\                                     -");
                System.out.println("        .--.                              -");
                System.out.println("       |o_o |                             -");
                System.out.println("       |:_/ |                             -");
                System.out.println("      //   \\ \\                            -");
                System.out.println("     (|     | )                           -");
                System.out.println("    /'\\_   _/`\\                           -");
                System.out.println("    \\___)=(___/                           -");
                System.out.println("-------------------------------------------");
                // Hier wordt er gevraagd of dat je het spel opnieuw wilt spelen dit wordt opgeslagen in variabele "nogis".
                System.out.print("Wil je de pinguïn nog iets laten zeggen? (j/n) ");
                nogis = keyboard.nextLine();
            }
        }
    }
}
