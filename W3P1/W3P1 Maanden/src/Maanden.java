import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 3/10/2022
 */
public class Maanden {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Hier worden een paar variabelen gedefinieerd.
        int januari = 1, februari  = 2, maart = 3, april= 4, mei = 5, juni = 6, juli = 7, augustus = 8, september = 9, oktober = 10, november = 11, december = 12, schrikkeljaar = 0;
        // Hier worden wat vragen gestalt.
        System.out.print("Geef een maand in in de vorm van een cijfer (1 = januari): ");
        int maand = keyboard.nextInt();
        if (maand > 12) {
            System.out.println("Ongeldige maand ingegeven. Einde!");
            System.exit(0);
        }
        System.out.print("Geef een jaar (met 4 cijfers): ");
        int jaar = keyboard.nextInt();
        // Hier start een switch.
        switch (maand) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("In het jaar " + jaar + " telt " + maand + "e zijn er 31 dagen."); break;
            case 4: case 6: case 9: case 11:
                System.out.println("In het jaar " + jaar + " telt " + maand + "e zijn er 30 dagen."); break;
            case 2:
                if ((jaar % 400 == 0) || ((jaar % 4 == 0) && (jaar % 100 != 0))) {
                    schrikkeljaar = 28;
                } else {
                    schrikkeljaar = 29;
                }
                System.out.println("In het jaar " + jaar + " telt " + maand + "e zijn er " + schrikkeljaar + " dagen."); break;
            default:
                System.exit(0);
        }

    }
}
