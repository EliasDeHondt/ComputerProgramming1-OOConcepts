/**
 * Van Elias De Hondt
 * 27/10/2022
 */
public class MatrixSom {
    public static void main(String[] args) {
        int[][] eerste = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] tweede = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        // Declareer als eerste een tweedimensionale array met de naam som om de som van beide matrices in op te nemen.
        int[][] som = new int[3][3];
        // Gebruik een dubbele for-lus om beide matrices op te tellen.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                som[i][j] = eerste[i][j] + tweede[i][j];
            }
        }
        // Druk vervolgens de som-matrix af (dubbele for lus).
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", som[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        // Druk de matrix opnieuw af, maak nu gebruik van een dubbele for-each.
        for (int[] rij : som) {
            for (int getal : rij) {
                System.out.printf("%d ", getal);
            }
            System.out.println();
        }
    }
}
