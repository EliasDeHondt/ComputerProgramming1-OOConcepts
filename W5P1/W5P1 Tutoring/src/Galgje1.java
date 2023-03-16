import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 21/10/2022
 */
public class Galgje1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String woord, gok;
        // =================================================
        do {
            System.out.print("Geef een woord (max 10 letters): ");
            woord = key.next().toLowerCase();
        } while (!(woord.length() <= 10 && woord.length() >= 5));
        // =================================================
        for (int i = 0; i < 20; i++) System.out.println();
        // =================================================
        System.out.print("Het te zoeken woord: ");
        for (int i = 0; i < woord.length(); i++) System.out.print(".");
        // =================================================
        System.out.print("\nDoe een gok: ");
        gok = key.next().toLowerCase();
        for (int i = 1; i <= 6; i++) {
            if (woord.equals(gok)) {
                System.out.printf("Proficiat, je hebt het woord geraden in %d beurten!", i);
                break;
            } else {
                System.out.print("Fout! Doe een gok: ");
                gok = key.next().toLowerCase();
            }
        }
        // =================================================
    }
}
