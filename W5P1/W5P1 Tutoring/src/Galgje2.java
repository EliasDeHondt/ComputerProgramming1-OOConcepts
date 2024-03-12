import java.util.Scanner;

/**
 @author Elias De Hondt
 * 21/10/2022
 */
public class Galgje2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String woord, gok;


        do {
            System.out.print("Geef een woord (max 10 letters): ");
            woord = key.next().toLowerCase();
        } while (!(woord.length() <= 10 && woord.length() >= 5));


        for (int i = 0; i < 20; i++) System.out.println();


        System.out.print("Het te zoeken woord: ");
        for (int i = 0; i < woord.length(); i++) System.out.print(".");


        System.out.print("\nRaad een letter: ");
        gok = key.next().toLowerCase();

        for (int i = 1; i <= 8; i++) {
            for (int x = 0; x < woord.length(); x++) {
                if (woord.charAt(x) == gok.charAt(x)) {



                }

            }

        }

    }
}
