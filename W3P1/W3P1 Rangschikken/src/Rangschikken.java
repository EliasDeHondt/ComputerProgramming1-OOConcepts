import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 6/10/2022
 */
public class Rangschikken {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        for (int i = 1; i <= 20; i++) {
            System.out.println("De faculteit van " + i + " is: " + faculteit(i));
        }
    }
    // n! = 2 * 3 * 4 * ... * (n-1) * n
    public static long faculteit(long n) {
        long faculteit = 1;
        for (int i = 2; i <= n; ++i) {
            faculteit *= i;
        }
        return faculteit;
    }
}
