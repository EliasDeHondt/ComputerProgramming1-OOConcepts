import java.util.Scanner;

/**
 @author Elias De Hondt
 * 3/10/2022
 */
public class Kerstboom {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Geef de breedte van de kerstboom (oneven getal 13..29): ");
        int breedte = key.nextInt();
        if (breedte > 29 || breedte < 13) {
            breedte = 13;
        }
        int space = (breedte / 2) + 1, middle = (breedte / 2) - 1;
        for (int boom = breedte; boom > 0; boom -= 2) {
            space -= 1;
            for (int i = 0; i < space; i++) {
                System.out.print((char) 32);
            }
            for (int i = 0; i <= breedte - boom; i++) {
                System.out.print((char) 42);
            }
            System.out.println("");
        }
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < middle; b++) {
                System.out.print((char) 32);
            }
            for (int x = 0; x < 3; x++) {
                System.out.print((char) 42);
            }
            System.out.println("");
        }
    }
}