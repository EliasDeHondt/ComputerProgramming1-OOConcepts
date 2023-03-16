import java.util.Random;
import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 24/10/2022
 */
public class DemoSpeelkaart {
    private static Scanner key = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {

        System.out.print("Hoeveel kaarten wens je: ");
        int hoeveel = key.nextInt();
        String[] speelkaarten = new String[hoeveel];
        maakSpeelkaarten(hoeveel, speelkaarten);
        toonSpeelkaarten(speelkaarten);
    }

    public static void maakSpeelkaarten(int hoeveel, String[] speelkaarten) {
        for (int i = 0; i < hoeveel; i++) {
            int randomKleuren = random.nextInt(0, 4);
            int randomWaarden = random.nextInt(0, 13);
            String[] kleuren = {"Harten", "Schoppen", "Ruiten", "Klaveren"};
            String[] waarden = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Dame", "Heer"};
            speelkaarten[i] = kleuren[randomKleuren] + ' ' + waarden[randomWaarden];
        }
    }

    public static void toonSpeelkaarten(String[] speelkaarten) {
        for (String speelkaart : speelkaarten) {
            System.out.println(speelkaart);
        }
    }
}