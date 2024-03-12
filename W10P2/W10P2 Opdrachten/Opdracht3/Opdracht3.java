import java.util.*;

/**
 @author Elias De Hondt
 * 8/12/2022
 */
public class Opdracht3 {
    // Attributen
    // Constructors
    // Methode
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> getallenList = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            getallenList.add(random.nextInt(0,50));
        }
        // Probeer uit en druk telkens ter controle de getallenList af:
        System.out.println(getallenList.toString() + " ");
        // Sorteer van klein → groot
        Collections.sort(getallenList);
        System.out.println(getallenList.toString() + " ");
        // Sorteer van groot → klein
        Collections.reverse(getallenList);
        System.out.println(getallenList.toString() + " ");
        // Schud dooreen
        Collections.shuffle(getallenList);
        System.out.println(getallenList.toString() + " ");
        // Toon de grootste
        System.out.println("Max : " + Collections.max(getallenList));
        // Druk het aantal keren af dat 49 in getallenList voorkomt
        System.out.println("Freqency \"49\": " + Collections.frequency(getallenList,49));
        // Zet alle getallen op 49
        Collections.fill(getallenList,49);
        // Druk het aantal keren af dat 49 in getallenList voorkomt
        System.out.println("Freqency \"49\": " + Collections.frequency(getallenList,49));
    }
}
