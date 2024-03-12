import java.util.Scanner;

/**
 @author Elias De Hondt
 * 27/10/2022
 */
public class Opdracht6 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int teller = 0;

        System.out.print("Wat is het woord? ");
        String zin = key.nextLine();

        // Van zin naar woord
        String[] worden = zin.split(" ");
        for (String woord : worden) {
            System.out.printf("\"%S\" ", woord);
            teller++;

        }
        System.out.println();
        // Van zin naar letters
        char[] letters = zin.toCharArray();
        for (char letter : letters) {
            System.out.printf("'%S' ", letter);
        }
        // ...
        StringBuilder[] sbArray = new StringBuilder[teller];

        for (int i = 0; i < worden.length; i++) {
            sbArray[i] = new StringBuilder(worden[i]);
        }
        System.out.print("\nAlle StringBuilders:\n{");
        for (int i = 0; i < sbArray.length; i++) {
            System.out.printf("%s, ", sbArray[i]);
        }
        System.out.println("}");


    }
}
