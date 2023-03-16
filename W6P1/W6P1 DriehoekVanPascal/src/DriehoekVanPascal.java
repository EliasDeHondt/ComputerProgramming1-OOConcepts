import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 29/10/2022
 */
public class DriehoekVanPascal {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Geef de het aantal rijen: ");
        int aantal = key.nextInt()+1;
        if (aantal > 13 || aantal < 1) aantal = 12;
        int[][] driehoek = new int[aantal][aantal];
        for (int i = 0; i < aantal; i++) driehoek[i][0] = 1;
        for (int i = 0; i < aantal; i++) {
            for (int j = 0; j < i; j++) {
                if (j > 0) driehoek[i][j] = driehoek[i-1][j-1] + driehoek[i-1][j];
                System.out.printf("%3d ", driehoek[i][j]);
            }
            System.out.println();
        }
    }
}
