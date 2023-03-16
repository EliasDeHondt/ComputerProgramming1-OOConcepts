import java.util.Scanner;

/**
 * @author Elias De Hondt
 * 19/09/2022
 */
public class Som {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Vraagt voor het eerste getal.
        System.out.print("Tik een getal in: ");
        int eerste = keyboard.nextInt();
        // Vraagt voor het tweede getal.
        System.out.print("Tik nog een getal in: ");
        int tweede = keyboard.nextInt();
        // Telt eersten en tweede getal op in som.
        int som = eerste + tweede;
        // Print som.
        System.out.print("Dit is de som: " + som);
    }
}
