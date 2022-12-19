/**
 * Van Elias De Hondt
 * 20/10/2022
 */
public class DemoPerfect {
    public static void main(String[] args) {

        for (int i = 2; i < 10000; i++ ) {
            Getal getal1 = new Getal(i);
            if (getal1.isPerfect()) {
                System.out.println(getal1.getDelers());
            }
        }
    }
}
