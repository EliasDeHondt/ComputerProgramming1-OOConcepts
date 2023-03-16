import java.util.Random;
import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 13/10/2022
 */
public class StringBuilderExperiment {
    public static void main(String[] args) {
        //=========================================================================================
        Scanner key = new Scanner(System.in);
        System.out.print("Geef uw voornaam en naam: ");
        String volnaam = key.nextLine();
        //=========================================================================================
        // Builder1: bevat enkel de initialen.
        StringBuilder builder1 = new StringBuilder();
        for (int i = 0; i < volnaam.length(); ++i) {
            if (Character.isUpperCase(volnaam.charAt(i))) {
                builder1.append(volnaam.charAt(i)).append(".");
            }
        }
        System.out.println("Initialen : " + builder1);
        //=========================================================================================
        // Builder2: bevat de omgekeerde naam
        StringBuilder builder2 = new StringBuilder(volnaam);
        System.out.println("Omgekeerd : " + builder2.reverse());
        //=========================================================================================
        // Builder3: bevat de eerste helft van de naam
        StringBuilder builder3 = new StringBuilder(volnaam);
        System.out.println("Gehalveerd: " + builder3.delete(volnaam.length()/2, volnaam.length()));
        //=========================================================================================
        // Builder4: bevat de letters in willekeurige volgorde
        StringBuilder builder4_0 = new StringBuilder();
        StringBuilder builder4_1 = new StringBuilder(volnaam);
        Random random = new Random();
        for(int i = 0; i < volnaam.length(); i++){
            int letter = random.nextInt(builder4_1.length());
            builder4_0.append(builder4_1.charAt(letter));
            builder4_1.deleteCharAt(letter);
        }
        System.out.println("Na shuffle: " + builder4_0);
        //=========================================================================================

    }
}
