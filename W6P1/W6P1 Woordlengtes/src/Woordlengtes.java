import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 24/10/2022
 */
public class Woordlengtes {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int langste = 0;
        int kortste = 0;
        // Hoeveel woorden ga je intikken?
        System.out.print("Hoeveel woorden ga je intikken? ");
        String[] woorden = new String[key.nextInt()];
        // Wat zijn alle woorden?
        for (int i = 0; i < woorden.length; i++) {
            System.out.printf("Woord %d: ", (i + 1));
            woorden[i] = key.next();
        }
        // Wat is het langste en het kortste woord?
        for (int i = 0; i < woorden.length; i++) {

            if (woorden[langste].length() < woorden[i].length()) {
                langste = i;
            }
            if (woorden[kortste].length() > woorden[i].length()) {
                kortste = i;
            }

        }
        // Dit is het kortste woord.
        System.out.printf("kortste woord: %s\n", woorden[kortste]);
        // Dit is het langste woord.
        System.out.printf("langste woord: %s", woorden[langste]);
    }
}
