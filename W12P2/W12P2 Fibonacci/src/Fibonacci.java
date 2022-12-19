/**
 * Van Elias De Hondt
 * 19/12/2022
 */
public class Fibonacci {
    private static final long MAX = 91;

    public static long finonacciGetal(int n) {
        if (n < 0) throw new FibonacciException("Negatieve waarden zijn uitgesloten!");
        if (n > MAX) throw new FibonacciException("De maximale waarde voor type long werd overschreden!");
        long eerste = 0;
        long tweede = 1;
        long getal = 0;
        for (int i = 0; i < n; i++) {
            getal = eerste + tweede;
            eerste = tweede;
            tweede = getal;
        }
        return getal;
    }
}
