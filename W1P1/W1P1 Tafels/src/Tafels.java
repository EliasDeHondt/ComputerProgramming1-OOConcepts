import java.util.Objects;
import java.util.Scanner;

/**
 * @author Van Elias De Hondt
 * 23/09/2022
 */
public class Tafels {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Hier geven we de variabelen "nogis" de waarden "j".
        String nogis = "j";
        System.out.print("Wat is je naam? ");
        String naam = keyboard.nextLine();
        System.out.println("Welcome " + naam + ", wil je de theorie van de maaltafels bekijken of wil je oefenen?");
        System.out.println("\t1 Theorie");
        System.out.println("\t2 Oefenen");
        int keuze = keyboard.nextInt();

        if (keuze == 1) {
            // De while loop dat gebruikt wordt voor het theoretische gedeelte van de maaltafels.
            while (Objects.equals(nogis, "j")) {
                // Hier wordt er gevraagd welke tafel gepresenteerd moet worden.
                System.out.print("Welke tafel wil je zien? ");
                int tafel = keyboard.nextInt();
                // Hier wordt de gevraagde tafel afgeprint.
                // !!Dit hoort hier te staan maar ik begrijp de logica er niet van!!
                keyboard.nextLine();
                System.out.println("0" + "x" + tafel + "=" + "0");
                System.out.println("1" + "x" + tafel + "=" + tafel);
                System.out.println("2" + "x" + tafel + "=" + (2*tafel));
                System.out.println("3" + "x" + tafel + "=" + (3*tafel));
                System.out.println("4" + "x" + tafel + "=" + (4*tafel));
                System.out.println("5" + "x" + tafel + "=" + (5*tafel));
                System.out.println("6" + "x" + tafel + "=" + (6*tafel));
                System.out.println("7" + "x" + tafel + "=" + (7*tafel));
                System.out.println("8" + "x" + tafel + "=" + (8*tafel));
                System.out.println("9" + "x" + tafel + "=" + (9*tafel));
                System.out.println("10" + "x" + tafel + "=" + (10*tafel));
                // Hier wordt er gevraagd of dat je nog eens wil oefenen.
                System.out.print("Wil je nog een oefening maken? (j/n) ");
                nogis = keyboard.nextLine();
            }
        }
        if (keuze == 2) {
            // De while loop dat gebruikt wordt voor de oefeningen van de maaltafels.
            while (Objects.equals(nogis, "j")) {
                int getal = 0;
                int juist = 0;
                int fout = 0;
                System.out.print("Welke tafel wil je oefenen? ");
                int oefenen = keyboard.nextInt();
                while (getal != 11) {
                    System.out.print(getal + "x" + oefenen + "= ");
                    int antwoord = keyboard.nextInt();
                    if (antwoord == (getal*oefenen)) {
                        System.out.println("Juist!");
                        getal = getal + 1;
                        juist = juist + 1;
                    }
                    else {
                        System.out.println("Fout!");
                        fout = fout + 1;
                    }
                }
                // !!Dit hoort hier te staan maar ik begrijp de logica er niet van!!
                keyboard.nextLine();
                System.out.println("Proficiat je hebt alles kunnen beantwoorden! Dit is je scoren:");
                System.out.println("Aantal juist: " + juist);
                System.out.println("Aantal fout: " + fout);
                // Hier wordt er gevraagd of dat je theorie wil zien.
                System.out.print("Wil je nog theorie zien? (j/n) ");
                nogis = keyboard.nextLine();
            }
        }
    }
}
