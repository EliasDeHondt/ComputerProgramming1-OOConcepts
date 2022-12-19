import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 26/09/2022
 */
public class ASCIITabel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Hier worden een paar variabelen gedefinieerd.
        int teller1 = 32;
        // Hier begint een while loop deze blijft doorgaan tot dat de variabele "teller" op 127 staat.
        System.out.println("*******************************************************************");
        while (teller1 <= 127) {
            System.out.print((char)teller1 + " " + "(" + teller1 + ")" + "\t \t");
            if (teller1%6 == 1) {
                System.out.print("\n");
            }
            teller1++;
        }
        System.out.println("*******************************************************************");
        // Uitbreiding!!!
        // Hier worden een paar variabelen gedefinieerd.
        int teller2 = 128;
        // Hier begint een while loop deze blijft doorgaan tot dat de variabele "teller" op 255 staat.
        while (teller2 <= 255) {
            System.out.print((char)teller2 + " " + "(" + teller2 + ")" + "\t \t");
            if (teller2%6 == 1) {
                System.out.print("\n");
            }
            teller2++;
        }
        System.out.println();
        System.out.println("*******************************************************************");
        // Uitbreiding!!!
        // Hier worden een paar variabelen gedefinieerd.
        int teller3 = 256;
        // Hier begint een while loop deze blijft doorgaan tot dat de variabele "teller" op 383 staat.
        while (teller3 <= 383) {
            System.out.print((char)teller3 + " " + "(" + teller3 + ")" + "\t \t");
            if (teller3%6 == 1) {
                System.out.print("\n");
            }
            teller3++;
        }
        System.out.println();
        System.out.println("*******************************************************************");
    }
}
