import java.util.Scanner;

/**
 * @author Elias De Hondt
 * 23/09/2022
 */
public class Reeksen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Hier wordt de input gevraagd van variabele "aantal".
        System.out.print("Hoeveel getallen wil je afdrukken? ");
        Double aantal = keyboard.nextDouble();
        // Hier wordt de input gevraagd van variabele "starten".
        System.out.print("Met welke waarde wil je starten? ");
        Double starten = keyboard.nextDouble();
        // Hier wordt de input gevraagd van variabele "verhogen".
        System.out.print("Met welke waarde wil je verhogen? ");
        Double verhogen = keyboard.nextDouble();
        //Hier printen we het eerste deel af van de reeks (de oorspronkelijke input van variabelen "starten")
        System.out.print(starten + "\t");
        // Hier doen we minder 1 op variabel "aantal". Omdat we de originele input ook willen meetellen.
        aantal = aantal - 1;
        // Hier begint een while loop deze blijft doorgaan tot dat de variabele "aantal" op 0 staat.
        while (aantal > 0) {
            // Hier doen we minder 1 op variabel "aantal".
            aantal = aantal - 1;
            // Hier tellen we "starten" op met "verhogen" op variabele "staart"
            starten = starten + verhogen;
            // En hier printen we dan het volgende getal af In de reeks Dat is uitgewerkt met bovenstaande while loop.
            System.out.print(starten + "\t");
        }
    }
}
