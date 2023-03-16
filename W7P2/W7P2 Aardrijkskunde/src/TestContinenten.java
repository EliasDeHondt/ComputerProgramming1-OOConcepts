/**
 @author Van Elias De Hondt
 * 14/11/2022
 */
public class TestContinenten {
    public static void main(String[] args) {
        for (Continent continent : Continent.values()) {
            System.out.println(continent.name() + continent.toString());
        }

    }
}
