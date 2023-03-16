import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 3/10/2022
 */
public class Veelvouden {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        final int MAX = 100;

        System.out.print("Van welk getal wil je de veelvouden: ");
        int getal = key.nextInt();
        int veelvouden = getal;

        while (MAX > veelvouden) {
            System.out.print(veelvouden + " ");
            veelvouden += getal;
        }
    }
}
