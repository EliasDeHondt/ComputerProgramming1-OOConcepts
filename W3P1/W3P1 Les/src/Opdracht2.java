import java.util.Scanner;

/**
 * @author Elias De Hondt
 * 3/10/2022
 */
public class Opdracht2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Wat is je leeftijd? ");
        int leeftijd = key.nextInt();
        if (leeftijd < 2) {
            System.out.println("Je bent een baby.");
        } else if (leeftijd > 2 && leeftijd < 12) {
            System.out.println("Je bent een kind.");
        } else if (leeftijd > 13 && leeftijd < 17) {
            System.out.println("Je bent een tiener.");
        } else if (leeftijd >= 18) {
            System.out.println("Je bent een volwassene.");
        }
    }
}
