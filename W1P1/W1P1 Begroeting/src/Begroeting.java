import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 19/09/2022
 */
public class Begroeting {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Vraagt de naam.
        System.out.print("Wat is je naam? ");
        String naam = keyboard.nextLine();
        // Print de Naam.
        System.out.print("Welkom " + naam + "!");
    }
}
