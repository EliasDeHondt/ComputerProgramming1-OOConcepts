/**
 @author Van Elias De Hondt
 * 27/10/2022
 */
public class Opdracht4 {
    public static void main(String[] args) {


        StringBuilder[] kleuren = {
                new StringBuilder("Harten"),
                new StringBuilder("Schoppen"),
                new StringBuilder("Ruiten"),
                new StringBuilder("Klaveren"),
        };

         //StringBuilder[] kleuren = new StringBuilder[4];
         //kleuren[0] = new StringBuilder("Harten");
         //kleuren[1] = new StringBuilder("Schoppen");
         //kleuren[2] = new StringBuilder("Ruiten");
         //kleuren[3] = new StringBuilder("Klaveren");

        for (StringBuilder kleur : kleuren) {
            System.out.println(kleur.toString());
        }
    }
}
