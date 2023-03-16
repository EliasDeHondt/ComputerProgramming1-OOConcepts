import java.util.Scanner;

/**
 * @author Van Elias De Hondt
 * 6/10/2022
 */
public class Opdracht8 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double getal1, getal2, getal3;
        getal1 = leesGetal();
        getal2 = leesGetal();
        getal3 = leesGetal();
        double gemiddelde = berekenGemiddelde(getal1, getal2, getal3);
        toonGemiddelde(gemiddelde);
    }
    public static double leesGetal() {
        Scanner key = new Scanner(System.in);
        System.out.print("Geef een getal: ");
        double getal = key.nextDouble();
        return getal;
    }
    public static double berekenGemiddelde(double lol, double g2, double g3) {
        double gemiddelde = (lol + g2 + g3) / 3;
        return gemiddelde;
    }
    public static void toonGemiddelde(double g) {
        System.out.println("Het gemiddelde is: " + g);
    }
}