import java.util.Random;

/**
 * Van Elias De Hondt
 * 28/11/2022
 */

public class TestBord {
    // Attributen
    // Constructors
    // Methode
    private static final Random random = new Random();
    private static final int MAX_AANTAL = 10;
    public static void main(String[] args) {
        Bord[] borden = {
                new RondBord("karton", "groen", 30),
                new VierkantBord("porcelijn", "wit", 20),
                new RondBord("plastiek", "blauw", 35),
                new VierkantBord("inox", "zilver", 25),
        };
        // Vul hier aan
        for (int i = 0; i < MAX_AANTAL; i++) {
            System.out.println(borden[random.nextInt(0,borden.length)].toString());
        }
    }
}