/**
 @author Elias De Hondt
 * 24/10/2022
 */
public class Opdracht2 {
    public static void main(String[] args) {
        // =========================================
        int[] lottoGetallen = {3, 6, 17, 31, 32, 43};
        for (int i = 0; i < lottoGetallen.length; i++) {
            System.out.print(lottoGetallen[i] + " ");
        }
        // =========================================
        // for each
        for (int getal : lottoGetallen){
            System.out.print(getal + " ");

        }
        // =========================================
        // Wijzig de waarde van het tweede getal van 6 naar 13
        lottoGetallen[1] = 13;
        // =========================================
        for (int i = (lottoGetallen.length - 1); i >= 0; i--) {
            System.out.print(lottoGetallen[i] + " ");
        }
        // =========================================
    }
}
