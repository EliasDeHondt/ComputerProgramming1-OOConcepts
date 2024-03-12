import java.util.Scanner;

/**
 @author Elias De Hondt
 * 26/09/2022
 */
public class Codering {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Hier worden een paar variabelen gedefinieerd.
        int count0 = 0;
        int count1 = 0;
        System.out.print("Geef een bericht: ");
        String message = keyboard.nextLine();
        System.out.println("Wil je dit bericht coderen of decoderen? ");
        System.out.println("1\t Coderen");
        System.out.println("2\t Decoderen");
        int Choice = keyboard.nextInt();
        System.out.println("--------------------------------------------------");
        // Dit deel telt hoeveel karakters er zich bevinden in de string 'message'.
        // Dit deel is niet zelfverzonnen maar gehaald van het internet, maar ik snap wel wat er hier gaande is.
        for(int i = 0; i < message.length(); i++)
        {
            if(message.charAt(i) != ' ')
                count1++;
        }
        // Dit is het eerste if statement deze wordt geactiveerd wanneer je een bericht wilt coderen.
        if (Choice == 1) {
            System.out.println("Gecodeerd bericht:");
            while (count1 != count0) {
                char messageEncrypted = message.charAt(count0);
                ++messageEncrypted;
                System.out.print(messageEncrypted);
                ++count0;
            }
        }
        // Dit is het eerste if statement deze wordt geactiveerd wanneer je een bericht wilt decoderen.
        if (Choice == 2) {
            System.out.println("Gedecodeerd bericht:");
            while (count1 != count0) {
                char messageEncrypted = message.charAt(count0);
                --messageEncrypted;
                System.out.print(messageEncrypted);
                ++count0;
            }
        }
    }
}
