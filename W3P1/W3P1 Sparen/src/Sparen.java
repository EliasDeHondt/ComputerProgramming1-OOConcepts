import java.util.Scanner;

/**
 * @author Elias De Hondt
 * 3/10/2022
 */
public class Sparen {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Geef het bedrag: ");
        double bedrag = key.nextDouble();
        System.out.print("Geef het percentage: ");
        double interessant = key.nextDouble();
        for (int i = 0; i < 10; i++) {
            bedrag += (interessant / 100) * bedrag;
            System.out.println("bedrag na jaar " + i + ": " + bedrag);
        }
    }
}
