import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Van Elias De Hondt
 * 8/12/2022
 */
public class Demo {
    // Attributen
    // Constructors
    // Methode
    public static void main(String[] args) {
        List<Opdracht4> kind = new ArrayList<>();
        kind.add(new Opdracht4("Stevie",2,0.75));
        kind.add(new Opdracht4("Dorien",8,1.40));
        kind.add(new Opdracht4("Wouter",5,1.05));
        System.out.println(kind.toString());
        Collections.sort(kind);
        System.out.println(kind.toString());
    }
}
