import java.util.Scanner;

/**
 @author Elias De Hondt
 * 27/10/2022
 */
public class Opdracht5 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Wat is het woord? ");
        String zin = key.nextLine();

        // Van zin naar woord
        String[] worden = zin.split(" ");
        for (String woord : worden) {
            System.out.printf("\"%S\" ", woord);
        }
    }
}
