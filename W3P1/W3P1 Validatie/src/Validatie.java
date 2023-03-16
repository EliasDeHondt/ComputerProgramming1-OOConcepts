import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 6/10/2022
 */
public class Validatie {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double som = 0;
        for (int i = 1; i < 6; i++) {
            System.out.print("Geef het " + i + "e getal: ");
            int getal = key.nextInt();
            som = som + leesGetal(getal);
        }
        double gemiddelde = som / 5;
        System.out.println("Het gemiddelde van deze getallen is: " + gemiddelde);
    }

    public static int leesGetal(int getal) {
        Scanner key = new Scanner(System.in);
        if (getal < 0) {
            System.out.print("Getal moet positief zijn! Opnieuw: ");
            getal = key.nextInt();
        } else if (getal > 100) {
            System.out.print("Getal moet kleiner zijn dan 100! Opnieuw: ");
            getal = key.nextInt();
        } else if (getal > 50 && getal % 2 == 1) {
            System.out.print("Getal boven de 50 moet even zijn! Opnieuw: ");
            getal = key.nextInt();
        }
        return getal;
    }
}
