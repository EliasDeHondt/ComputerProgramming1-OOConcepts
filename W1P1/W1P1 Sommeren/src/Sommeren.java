import java.util.Objects;
import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 19/09/2022
 */
public class Sommeren {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Hier geven we de variabele "nogis" een waardig genaamd "j".
        String nogis = "j";
        // Hier starten we de eerste white loop deze is verantwoordelijk voor heel het programma opnieuw te starten indien nodig.
        while (Objects.equals(nogis, "j")) {                            // Objects.equals(nogis, "j") Dit heeft te maken met ...
            // Hier geven we de variabele "som" de waarde van "0".
            int som = 0;
            // Hier geven we de variabele "getal" de waarde van "1".
            int getal = 1;
            // Hier geven we de variabele "teller" de waarde van "0".
            int teller = 0;
            // Dit is de tweede white loop deze wordt gebruikt voor de vragen te stellen en de opstellingen te maken.
            while (getal != 0) { // De criteria van de while loop zijn als "getal" niet gelijk(!=) is aan nul(0) dan functie.
                teller = teller + 1; // Dit gebruiken we als teller er wordt na elke input van de vraag hieronder een bij teller opgeteld.
                System.out.print("Geef een getal (stop met 0): ");
                getal = keyboard.nextInt();
                // Hier wordt de input van bovenstaande vraag mee opgeteld bij de som.
                som = som + getal;
                // !!Dit hoort hier te staan maar ik begrijp de logica er niet van!!
                keyboard.nextLine();
            }
            // Deze if statement wordt gebruikt wanneer de waarde van "getal" op nul(0) staat.
            if (getal == 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("De som van deze getallen is: " + som);
                // Dit haalt een waarde van teller weg (Omdat anders de laatste input nul(0) wordt meegeteld).
                teller = teller - 1;
                System.out.println("Het aantal getallen in de berekening: " + teller);
                System.out.println("-----------------------------------------------");
                System.out.print("Wil je nog een berekening maken? (j/n) ");
                nogis = keyboard.nextLine();
            }
        }
    }
}