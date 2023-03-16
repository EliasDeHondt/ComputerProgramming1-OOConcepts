import java.util.Random;
import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 10/10/2022
 */
public class Craps {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int som = 0, teller = 1, tempSom = 0;
        String enter;
        do {
            som = gooi();
            if (teller == 1) {
                switch (som) {
                    case 2, 3, 12 -> {
                        System.out.println("Je gooide " + som + "\nJe bent verloren in " + teller + " beurten!");
                        System.exit(0);
                    }
                    case 7, 11 -> {
                        System.out.println("Je gooide " + som + "\nJe bent gewonnen in " + teller + " beurten!");
                        System.exit(0);
                    }
                }
            }
            if (som == tempSom) {
                System.out.println("Je gooide " + som + "\nJe bent gewonnen in " + teller + " beurten!");
                System.exit(0);
            }
            System.out.print("Je gooide " + som + "\nDe doelworp is: " + som + "\nDruk <ENTER> om te gooien!");
            enter = key.nextLine();
            tempSom = som;
            ++teller;
        } while (enter.isEmpty());
    }

    public static int gooi() {
        Random ran = new Random();
        int som = 0;
        for (int i = 0; i < 2; ++i) {
            int rol = ran.nextInt(1, 7);
            som = som + rol;
        }
        return som;
    }
}