import java.util.Random;

/**
 * Van Elias De Hondt
 * 27/10/2022
 */
public class Opdracht9 {
    public static void main(String[] args) {
        // Maak een 3D array parkeerplaatsen aan waarmee men bijhoudt hoe vaak een bepaalde parkeerplaats bezet is geweest.
        // D1 = Garages (2) | D2 = Verdiepingen (2) | D3 = Parkeerplaats (15)
        int[][][] parking = new int[2][2][15];
        // Genereer nu voor elke parkeerplaats een willekeurig getal 0-9.
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 15; k++) {
                    parking[i][j][k] = random.nextInt(0,9);
                }
            }
        }
        // Toon op het einde per garage de som van het aantal keer dat de parkeerplaatsen ingenomen zijn.
        int som = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 15; k++) {
                    som = som + parking[i][j][k];
                }
            }
            System.out.printf("Garages %d: %d keer gebruikt.\n", i+1, som);
            som = 0;
        }
    }
}
