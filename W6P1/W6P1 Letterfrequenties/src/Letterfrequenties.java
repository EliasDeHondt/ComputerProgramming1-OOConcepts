import java.util.Scanner;

/**
 @author Elias De Hondt
 * 24/10/2022
 */
public class Letterfrequenties {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int som = 0;
        System.out.print("Geef een zin: ");
        String zin = key.nextLine().toUpperCase();
        int[] tellers = new int[26];
        for (int i = 0; i < zin.length(); i++) {
            if (zin.charAt(i) >= 'A' && zin.charAt(i) <= 'Z') {
                tellers[zin.charAt(i) - 'A']++;
            }
        }
        for (int i = 65; i <= 90; i++) {
            if (i % 6 == 5) System.out.println();
            //if (i == 71 || i == 77 || i == 83 || i == 89) System.out.println();
            System.out.printf("%c --> %dx\t", (char) i, tellers[i - 65]);
        }
        for (int teller : tellers) {
            som += teller;
        }
        System.out.printf("\nTotaal aantal letters: %d", som);
    }
}