import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 7/10/2022
 */
public class Oefening3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Conversies");
        System.out.println("==========");
        System.out.print("Geef de te converteren eenheid: ");
        String eenheid1 = key.nextLine();
        System.out.print("Geef de eenheid naar waar geconverteerd wordt: ");
        String eenheid2 = key.nextLine();
        System.out.print("Geef de waarde van a: ");
        double a = key.nextDouble();
        System.out.print("Geef de waarde van b: ");
        double b = key.nextDouble();
        System.out.print("Geef de startwaarde in " + eenheid1 + ": ");
        int startwaarde = key.nextInt();
        System.out.print("Geef de eindwaarde in " + eenheid1 + ": ");
        int eindwaarde = key.nextInt();
        System.out.print("Geef de stapwaarde: ");
        int stapwaarde = key.nextInt();
        inchNaarCm(eenheid1, eenheid2, startwaarde, eindwaarde, stapwaarde, a, b);
    }

    public static void inchNaarCm(String eenheid1, String eenheid2, int startwaarde, int eindwaarde, int stapwaarde, double a, double b) {
        System.out.println("=================");
        System.out.printf("| %5s | %5s |\n", eenheid1, eenheid2);
        System.out.println("|---------------|");
        for (int i = startwaarde; i <= eindwaarde; i += stapwaarde) {
            // x = a * waarde + b
            double cm = (i * a) + b;

            System.out.printf("| %5d | %5.2f |\n", i, cm);
        }
        System.out.println("=================");
    }
}

