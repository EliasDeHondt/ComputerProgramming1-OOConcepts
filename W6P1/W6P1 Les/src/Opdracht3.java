/**
 @author Elias De Hondt
 * 24/10/2022
 */
public class Opdracht3 {
    public static void main(String[] args) {
        int[] veelvouden = new int[20];

        for (int i = 0; i < veelvouden.length; i++) {
            veelvouden[i] = i * 7;
        }
        System.out.println();
        for (int veelvoud : veelvouden) {
            System.out.print(veelvoud + " ");
        }
        System.out.println();
        for (int i = (veelvouden.length - 1); i >= 0; i--) {
            System.out.print(veelvouden[i] + " ");
        }
    }
}
