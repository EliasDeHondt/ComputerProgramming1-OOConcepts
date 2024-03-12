import java.util.Scanner;

/**
 @author Elias De Hondt
 * 10/10/2022
 */
public class Koortsmeetsysteemstrook {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Geef een woord: ");
        String woord = key.nextLine();
        boolean yesNo = isPalindroom(woord);
        if (yesNo) {
            System.out.println("“" + woord + "” is geen palindroom!");
        } else {
            System.out.println("“" + woord + "” is een palindroom!");
        }
    }

    public static boolean isPalindroom(String woord) {
        woord = woord.toLowerCase();
        boolean yesNo = false;
        int teller = 1;
        for (int i = 0; i < woord.length(); i++) {
            int x = woord.length() - teller;
            char letterL = woord.charAt(i);
            char letterR = woord.charAt(x);
            if (letterL != letterR) {
                yesNo = true;
                break;
            }
            ++teller;
        }
        return yesNo;
    }
}
