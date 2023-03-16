import java.util.Scanner;

/**
 * @author Elias De Hondt
 * 19/09/2022
 */
public class Product {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Vraagt voor het getal1.
        System.out.print("Geef een getal: ");
        int getal1 = keyboard.nextInt();
        // Vraagt voor het getal2.
        System.out.print("Geef nog een getal: ");
        int getal2 = keyboard.nextInt();
        // Vraagt voor het getal3.
        System.out.print("Geef een laatste getal: ");
        int getal3 = keyboard.nextInt();
        // Doet getal1 maal getal2 maal getal3 in product.
        int product = getal1 * getal2 * getal3;
        // Print product.
        System.out.print("Dit is de vermenigvuldiging: " + product);
    }
}