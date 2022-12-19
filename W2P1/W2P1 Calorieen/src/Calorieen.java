import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 26/09/2022
 */
public class Calorieen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        //
        final int FLAND = 999999;
        final int GEMIDDELDE_CALORIEEN = 2256;
        final int CALORIEEN_IN_PIZZA = 906;
        //
        System.out.print("Geef de naam van het land: ");
        String land = keyboard.nextLine();
        System.out.print("Hoeveel mensen wonen er in België? ");
        long mensen = keyboard.nextInt();
        //
        while (mensen < FLAND) {
            System.out.println("Fout! Dit getal is veel te klein!");
            System.out.print("Hoeveel mensen wonen er in België? ");
            mensen = keyboard.nextInt();
        }
        //
        if (mensen > FLAND) {
            long Calorieen = mensen * GEMIDDELDE_CALORIEEN;
            System.out.println("In " + land + " verbruiken alle inwoners samen " + Calorieen + " calorieën per dag.");
            long pizzas = Calorieen / CALORIEEN_IN_PIZZA;
            System.out.println("Dat komt overeen met " + pizzas + " pizza’s per dag.");
        }
    }
}
