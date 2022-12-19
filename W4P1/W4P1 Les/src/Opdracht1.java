import java.util.Random;

/**
 * Van Elias De Hondt
 * 10/10/2022
 */
public class Opdracht1 {
    public static void main(String[] args) {
        Random generator0 = new Random();
        Random generator1 = new Random(100);
        // 10 random getallen van 1 tot 45
        for (int i = 0; i < 10; i++) {
            int getal = generator0.nextInt(1,46);
            System.out.print(getal + " ");
        }
        System.out.println();
        // 5 random getallen van 0 tot 60 altijd even
        for (int i = 0; i < 5; i++) {
            int getal = generator0.nextInt(30) *2;
            System.out.print(getal + " ");
        }
        System.out.println();
        // 10 random getallen van 1 tot 10
        // Maar altijd dezelfde getallen (seed)
        for (int i = 0; i < 10; i++) {
            int getal = generator1.nextInt(1,11);
            System.out.print(getal + " ");
        }
    }
}
