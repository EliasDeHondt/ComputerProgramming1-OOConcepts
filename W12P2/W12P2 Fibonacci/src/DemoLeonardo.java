/**
 @author Van Elias De Hondt
 * 19/12/2022
 */
public class DemoLeonardo {
    public static void main(String[] args) {
        try {
            Fibonacci.finonacciGetal(-1);
        } catch (FibonacciException e) {
            System.out.println(e.getMessage());
        }
        try {
            for(int i=0; i<100; i++) {
                double deeltal = Fibonacci.finonacciGetal(i + 1);
                long deler = Fibonacci.finonacciGetal(i);
                System.out.printf("f(%d) / f(%d) = %.15f%n", i + 1, i, deeltal / deler);
            }
        } catch (FibonacciException e) {
            System.out.println(e.getMessage());
        }
    }
}
