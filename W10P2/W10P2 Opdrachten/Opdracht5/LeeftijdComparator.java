import java.util.Comparator;

/**
 @author Elias De Hondt
 * 8/12/2022
 */
public class LeeftijdComparator implements Comparator<Opdracht5> {
    // Methode
    @Override
    public int compare(Opdracht5 o1, Opdracht5 o2) {
        return o1.getLeeftijd() - o2.getLeeftijd();
    }
}
