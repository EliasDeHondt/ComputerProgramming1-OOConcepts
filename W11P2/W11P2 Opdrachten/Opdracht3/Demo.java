import java.util.*;

/**
 @author Elias De Hondt
 * 8/12/2022
 */
public class Demo {
    // Attributen
    // Constructors
    // Methode
    public static void main(String[] args) {
        Map<String,Kind> map = new TreeMap<>();
        map.put("Lukas",new Kind("Stevie",2,0.75));
        map.put("Daisy",new Kind("Daisy",8,1.40));
        map.put("Daisy",new Kind("Daisy",4,1.20));
        map.put("Fred",new Kind("Fred",5,1.05));

        System.out.println(map.toString());

        System.out.println();

        System.out.println(map.keySet());

        System.out.println();

        // KeySet
        for (String naam: map.keySet()) {
            System.out.print(naam + " ");
        }

        System.out.println("\n");

        // Values
        for (Kind kind: map.values()) {
            System.out.println(kind + " ");
        }
    }
}
