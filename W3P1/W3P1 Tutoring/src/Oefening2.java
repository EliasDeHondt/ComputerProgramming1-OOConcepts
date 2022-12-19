import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 7/10/2022
 */
public class Oefening2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Conversietabel °C naar °F");
        System.out.println("=========================");
        System.out.print("Geef de begintemperatuur in °C: ");
        int begintemperatuur = key.nextInt();
        System.out.print("Geef de eindtemperatuur in °F: ");
        int eindtemperatuur = key.nextInt();
        System.out.print("Geef de stapwaarde: ");
        int stapwaarde = key.nextInt();
        if (begintemperatuur > eindtemperatuur) {
            System.out.println("De begintemperatuur moet kleiner zijn dan de eindtemperatuur!");
            System.exit(0);
        }
        cNaarF(begintemperatuur, eindtemperatuur, stapwaarde);
    }

    public static void cNaarF(int begintemperatuur, int eindtemperatuur, int stapwaarde) {
        System.out.println("===============");
        System.out.printf("| %4s | %4s |\n", "°C", "°F"); //printF!!!!
        System.out.println("|-------------|");
        for (int i = begintemperatuur; i <= eindtemperatuur; i += stapwaarde) {
            double f = (i * 1.8) + 32;
            System.out.printf("| %4d | %4.1f |\n", i, f); //printF!!!!
        }
        System.out.println("===============");
    }
}
