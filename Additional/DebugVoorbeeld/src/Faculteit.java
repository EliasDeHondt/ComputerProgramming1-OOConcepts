public class Faculteit {
    public static long faculteit(int getal) {
        long result = 1;
        for (int i = 1; i <= getal; i++) {
            result *= i;
        }
        return result;
    }
}
