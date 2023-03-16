import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 6/10/2022
 */
public class Oefening1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Conversie graden Celsius - Fahrenheit");
        System.out.println("=====================================");
        while (true) {
            System.out.println("Welke conversie wens je te doen? ");
            System.out.print("1) °C naar °F\n2) °F naar °C\nUw keuze?  ");
            int keuze = key.nextInt();
            switch (keuze) {
                case 0: {
                    System.out.println("Tot ziens! ");
                    System.exit(0);
                }
                case 1:
                    cNaarF();
                case 2:
                    fNaarC();
                default:
                    System.exit(0);
            }
        }
    }

    public static void cNaarF() {
        Scanner key = new Scanner(System.in);
        System.out.print("Geef de waarde in °C: ");
        int c = key.nextInt();
        // f = (c*1,8) + 32
        double f = (c * 1.8) + 32;
        System.out.println(c + "°C = " + f + "°F");
    }

    public static void fNaarC() {
        Scanner key = new Scanner(System.in);
        System.out.print("Geef de waarde in °F: ");
        int f = key.nextInt();
        // c = (F - 32) / 1,8
        double c = (f - 32) / 1.8;
        System.out.println(f + "°F = " + c + "°C");
    }
}
