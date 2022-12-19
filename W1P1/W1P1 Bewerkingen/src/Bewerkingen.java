import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 19/09/2022
 */
public class Bewerkingen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Vraagt voor het eersten getal.
        System.out.print("Geef een getal: ");
        int getal1 = keyboard.nextInt();
        // Vraagt voor het tweeden getal.
        System.out.print("Geef nog een getal: ");
        int getal2 = keyboard.nextInt();
        // Vraagt voor welke bewerking je wilt doen.
        System.out.println("Kiet een bewerking:");
        System.out.println("\t" + "1" + " optellen");
        System.out.println("\t" + "2" + " aftrekken");
        System.out.println("\t" + "3" + " vermenigvuldigen");
        System.out.println("\t" + "4" + " delen");
        int bewerking = keyboard.nextInt();
        System.out.println("Jouw keuze: " + bewerking);
        // Berekenen de gevraagde bewerking.
        // Optellen.
        if (bewerking == 1) {
            int som = getal1 + getal2;
            System.out.println(getal1 + "+" + getal2 + "=" + som);
            // Aftrekken.
        } else if (bewerking == 2) {
            int verschil = getal1 - getal2;
            System.out.println(getal1 + "-" + getal2 + "=" + verschil);
            // Vermenigvuldigen.
        } else if (bewerking == 3) {
            int product = getal1 * getal2;
            System.out.println(getal1 + "*" + getal2 + "=" + product);
            // Delen.
        } else if (bewerking == 4) {
            int quotiënt = getal1 / getal2;
            System.out.println(getal1 + "/" + getal2 + "=" + quotiënt);
        }
    }
}
