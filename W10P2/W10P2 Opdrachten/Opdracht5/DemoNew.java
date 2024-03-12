import java.util.*;

/**
 @author Elias De Hondt
 * 15/12/2022
 */
public class DemoNew {
    // Attributen
    // Constructors
    // Methode
    public static void main(String[] args) {
        List<Opdracht5> kind = new ArrayList<>();
        kind.add(new Opdracht5("Stevie",2,0.75));
        kind.add(new Opdracht5("Dorien",8,1.40));
        kind.add(new Opdracht5("Wouter",5,1.05));
        // =============================
        System.out.println(kind.toString());
        Collections.sort(kind);
        System.out.println(kind.toString());
        // =============================
        Collections.sort(kind, new LeeftijdComparator());
        System.out.println(kind.toString());
        // =============================
        Collections.sort(kind, new Comparator<Opdracht5>() {
            @Override
            public int compare(Opdracht5 o1, Opdracht5 o2) {
                return (int)(o1.getLengte() - o2.getLengte() * 100);
            }
        });
        System.out.println(kind.toString());
        // =============================

    }
}