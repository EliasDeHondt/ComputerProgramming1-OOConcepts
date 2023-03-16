import java.util.Random;

/**
 @author Van Elias De Hondt
 * 10/10/2022
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random generator = new Random();
        for (int i = 0; i < 6; i++) {
            int getal = generator.nextInt(1,7);
            System.out.print(getal + " ");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            boolean getal = generator.nextBoolean();
            System.out.print(getal + " ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            double getal = generator.nextDouble();
            System.out.print(getal + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            int getal = generator.nextInt(900, 1000);
            System.out.print(getal + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            double getal = generator.nextDouble(5,10);
            System.out.print(getal + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            int getal = generator.nextInt(0, 100);
            System.out.print(getal + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            int getal = generator.nextInt(1, 100) * 3;
            System.out.print(getal + " ");
        }
    }
}
