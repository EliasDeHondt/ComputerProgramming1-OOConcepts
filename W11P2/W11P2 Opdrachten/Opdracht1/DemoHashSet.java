import java.util.*;

/**
 @author Van Elias De Hondt
 * 12/12/2022
 */
public class DemoHashSet {
    // Methods
    public static void main(String[] args) {
        String[]girls = {
                "An", "Bea", "Bea", "Diana",
                "Zoë", "Katleen", "Kristin", "Bea", "Kristin", "Gertrude"};
        Set<String> namenSet = new HashSet<>(Arrays.asList(girls));
        System.out.println(namenSet.toString());
        // ===========================================
        System.out.println();
        for (String temp : namenSet) {
            System.out.println(temp);
        }
        // ===========================================
        System.out.println();
        for (Iterator<String> iterator = namenSet.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());

        }
    }
}
