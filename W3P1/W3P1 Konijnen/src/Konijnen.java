import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 6/10/2022
 */
// Rij van Fibonacci
public class Konijnen {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Aantal maanden: ");
        int maanden = key.nextInt();
        int n = maanden;
        berekenKonijnen(n, maanden);
    }

    public static void berekenKonijnen(int n, int maanden) {
        int getal1 = 1, getal2 = 1;
        while (n > 2) {
            int getal3 = getal1 + getal2;
            getal1 = getal2;
            getal2 = getal3;
            --n;
        }
        System.out.println("Na " + maanden + " maanden heb je " + getal2 + " paar konijnen.");
    }
}
