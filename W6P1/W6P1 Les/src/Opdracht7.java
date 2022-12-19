/**
 * Van Elias De Hondt
 * 27/10/2022
 */
public class Opdracht7 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][6];

        for (int rij = 0; rij < matrix.length; rij++) {
            for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
                matrix[rij][kolom] = (rij+1)*(kolom+1);
            }
        }

        for (int[] rij : matrix) {
            for (int getal : rij) {
                System.out.printf("%3d", getal);
            }
            System.out.println(); // na elke rij een \n
        }
    }
}
