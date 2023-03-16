import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 17/10/2022
 */
public class DenD {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Dobbelsteen DS1 = new Dobbelsteen();
        System.out.print("Hoeveel zijden? ");
        DS1.setZijden(key.nextInt());
        key.nextLine();
         for (int i = 0; i < 5; i++) {
             System.out.print("Druk op <ENTER> om een worp te doen:");
             String enter = key.nextLine();
             System.out.println(DS1.gooi());
         }
        System.out.println("Klaar.");
    }
}
