import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 6/10/2022
 */
public class Wachtwoorden {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean trueFalse = true;
        while (trueFalse) {
            System.out.print("Geef een nieuw wachtwoord: ");
            String wachtwoord = key.nextLine();
            controleerWachtwoord(wachtwoord, trueFalse);
        }
    }

    public static boolean controleerWachtwoord(String wachtwoord, boolean trueFalse) {
        int upper = 0, lower = 0, number = 0, special = 0, aantal = 0;
        for (int i = 0; i < wachtwoord.length(); i++) {
            char ch = wachtwoord.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } else if (ch >= '0' && ch <= '9') {
                number++;
            } else {
                special++;
            }
        }
        aantal = upper + lower + number + special;
        if (aantal < 8) {
            System.out.println("FOUT: minstens 8 karakters");
            trueFalse = true;
        } else if (upper < 1) {
            System.out.println("FOUT: minstens 1 hoofdletter");
            trueFalse = true;
        } else if (lower < 1) {
            System.out.println("FOUT: minstens 1 kleine letter");
            trueFalse = true;
        } else if (number < 1) {
            System.out.println("FOUT: minstens 1 cijfer");
            trueFalse = true;
        } else {
            System.out.println("Je nieuwe wachtwoord is goedgekeurd!");
            System.exit(0);
        }
        return trueFalse;
    }
}