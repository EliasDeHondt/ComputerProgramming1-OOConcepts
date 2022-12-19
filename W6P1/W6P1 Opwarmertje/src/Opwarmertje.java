import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 24/10/2022
 */
public class Opwarmertje {
    private static final int AANTAL_TEMPERATUREN = 7;
    private static Scanner key = new Scanner(System.in);

    public static void main(String[] args) {

        double[] temperaturen = new double[AANTAL_TEMPERATUREN];

        voerTemperaturenIn(temperaturen);

        printTemperaturen(temperaturen);

        System.out.printf("Gemiddelde: %1.1f", berekenGemiddelde(temperaturen));

    }
    public static void voerTemperaturenIn(double[] temperaturen) {
        for (int i = 0; i < AANTAL_TEMPERATUREN; i++) {
            System.out.printf("Dag %d: ", (i + 1));
            temperaturen[i] = key.nextDouble();
        }

    }
    public static void printTemperaturen(double[] temperaturen) {
        System.out.print("Overzicht:\n=================\n");
        for (int i = 0; i < AANTAL_TEMPERATUREN; i++) {
            System.out.printf("Dag %d: %9.1f\n", (i + 1), temperaturen[i]);
        }
        System.out.print("=================\n");

    }
    public static double berekenGemiddelde(double[] temperaturen) {
        double som = 0, gemiddelde = 0;
        for (int i = 0; i < AANTAL_TEMPERATUREN; i++) {
            som += temperaturen[i];
        }
        return gemiddelde = som / temperaturen.length;
    }
}
