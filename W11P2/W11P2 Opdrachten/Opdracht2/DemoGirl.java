import java.util.*;

/**
 * Van Elias De Hondt
 * 12/12/2022
 */
public class DemoGirl {
    // Methods
    public static void main(String[] args) {
        Girl[] girls = {new Girl("An", 20),new Girl("Bea", 20),
                new Girl("Bea", 25), new Girl("Diana", 25),
                new Girl("Zoë", 18), new Girl("Katleen", 18),
                new Girl("Bea", 20)};
        List<Girl> girlsList = new ArrayList<>(Arrays.asList(girls));
        Set<Girl> girlsSet = new HashSet<>(Arrays.asList(girls));
        Set<Girl> girlsTree = new TreeSet<>(Arrays.asList(girls));
        System.out.println("GirlsList\n" + girlsList.toString());
        System.out.println("GirlsSet\n" + girlsSet.toString());
        System.out.println("girlsTree\n" + girlsTree.toString());

    }
}
