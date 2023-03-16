import labyrint.Speler;

import java.util.Random;

/**
 * @author Van Elias De Hondt
 * 20/10/2022
 */
public class DemoSpeler2 {
    public static void main(String[] args) {
        Speler speler1 = new Speler("Elias");
        Random random = new Random();
        System.out.println(speler1);
        do {
            // willekeurige stap links/rechts
            int stepX = random.nextBoolean()?1:-1;
            // willekeurige stap boven/onder
            int stepY = random.nextBoolean()?1:-1;
            speler1.verplaats(stepX, stepY);
            System.out.println(speler1);
            // %20 kans om aangevallen te worden.
            if (random.nextDouble() < 0.2) { // 0.0 -> 0.9999999999999999
                speler1.valAan();
            }
        } while (!speler1.isDood());
    }
}
