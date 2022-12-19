import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 3/10/2022
 */
public class Dobbelsteen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int enen = 0, tweeen = 0, drieen = 0, vieren = 0, vijven = 0, zessen = 0;
        for (int i = 6000, t = 0; i > t; t++) {
            int random = (int)(Math.random() * 6 + 1);
            switch (random) {
                case 1: ++enen; break;
                case 2: ++tweeen; break;
                case 3: ++drieen; break;
                case 4: ++vieren; break;
                case 5: ++vijven; break;
                case 6: ++zessen; break;
            }
        }
        System.out.println("Aantal enen: " + enen);
        System.out.println("Aantal tweeën: " + tweeen);
        System.out.println("Aantal drieën: " + drieen);
        System.out.println("Aantal vieren: " + vieren);
        System.out.println("Aantal vijven: " + vijven);
        System.out.println("Aantal zessen: " + zessen);
    }
}
