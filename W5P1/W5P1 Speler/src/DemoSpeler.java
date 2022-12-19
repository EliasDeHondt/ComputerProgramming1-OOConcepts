import labyrint.Speler;

import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 17/10/2022
 */
public class DemoSpeler {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        // Speler 1
        Speler speler1 = new Speler();


        // Wat is je naam?
        System.out.print("Wat is je naam? ");
        String naam = key.nextLine();
        speler1.setNaam(naam);

        // Test 1
        System.out.printf("Speler %s bevindt zich op %d, %d levens", speler1.getNaam(), speler1.getX(), speler1.getY());


        // Speler 2
        Speler speler2 = new Speler();
        System.out.println(speler2.getNaam());


    }
}
