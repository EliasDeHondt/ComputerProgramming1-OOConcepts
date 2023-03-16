import java.io.FileNotFoundException;
import java.util.*;

/**
 @author Van Elias De Hondt
 * 19/12/2022
 */
public class DemoBerghutten {
    // Methods
    public static void main(String[] args) throws FileNotFoundException {
        List<Berghutten> berghutten = FileHandler.leesBerghutten("W12P2/W12P2 Berghutten/data/berghutten.csv");
        Collections.sort(berghutten);
        for (Berghutten berghut : berghutten) {
            System.out.println(berghut);
        }
    }
}
