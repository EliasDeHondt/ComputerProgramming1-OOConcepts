import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 23/09/2022
 */
public class Kassa {
    public static void main(String[] args) {
        // kas1 = Kinderen <1m
        // kas2 = Kinderen tussen 1m en 1,40m
        // kas3 = Volwassenen
        // kas4 = Senioren (55+)
        Scanner keyboard = new Scanner(System.in);
        // Hier worden alle variabelen gedefinieerd.
        double korting1 = 0, korting2 = 0, prijs = 0, totaal = 0;
        // Hier wordt de user input gevraagd.
        System.out.print("Aantal kinderen <1m: ");
        double aantal1 = keyboard.nextDouble();
        System.out.print("Aantal kinderen tussen 1m en 1,40m: ");
        double aantal2 = keyboard.nextDouble();
        System.out.print("Aantal volwassenen: ");
        double aantal3 = keyboard.nextDouble();
        System.out.print("Aantal senioren (55+): ");
        double aantal4 = keyboard.nextDouble();
        // Hier wordt de prijs berekend zonder kortingen.
        prijs = (aantal2 * 26) + (aantal3 * 31) + (aantal4 * 15.5);
        // Als beide kortingen waar zijn wordt deze if statement geactiveerd.
        if ((aantal4 == 2) && ((aantal2 + aantal3 + aantal4) >= 10)) {
            korting1 = (aantal2 * 26) / 2;
            korting2 = (prijs / 100) * 10;
            // Als korting een groter is als korting twee wordt korting een berekent.
            if (korting1 > korting2) {
                totaal = prijs - korting1;
                korting2 = 0;
            }
            // Als korting twee groter is als korting een wordt korting twee berekend.
            else {
                totaal = prijs - korting2;
                korting1 = 0;
            }
        }
        // Als een van de twee kortingen maar waar zijn wordt een van de twee else if statements geactiveerd.
        else if (aantal4 == 2) {
            korting1 = (aantal2 * 26) / 2;
            totaal = prijs - korting1;
        }
        // Als een van de twee kortingen maar waar zijn wordt een van de twee else if statements geactiveerd.
        else if ((aantal2 + aantal3 + aantal4) >= 10) {
            korting2 = (prijs / 100) * 10;
            totaal = prijs - korting2;
        }
        // Hier is de output van alle berekeningen
        System.out.println("*******************************");
        System.out.println("*    Welkom in het pretpark!  *");
        System.out.println("*******************************");
        System.out.println("* Prijs: " + prijs + " EUR");
        System.out.println("* Grootouderkorting: " + "-" + korting1 + " EUR");
        System.out.println("* Groepskorting: " + "-" + korting2 + " EUR");
        System.out.println("* Totaal: " + totaal + " EUR");
        System.out.println("*******************************");
    }
}
