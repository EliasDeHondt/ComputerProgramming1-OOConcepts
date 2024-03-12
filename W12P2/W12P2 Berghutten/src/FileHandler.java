import java.io.*;
import java.util.*;

/**
 @author Elias De Hondt
 * 19/12/2022
 */
public class FileHandler {
    public static List<Berghutten> leesBerghutten(String pad) throws FileNotFoundException {
        List<Berghutten> berghuttenList = new ArrayList<>(); // New ArrayList of "Berghutten"
        Scanner file = new Scanner(new File(pad)); // New file
        while (file.hasNext()) { // Zolang niet EOF
            String regel = file.nextLine(); // Hele regel inlezen
            String[] regelData = regel.split(";");
            // int hoogte = Integer.parseInt(regelData[1]);
            // Berghutten berghut = new Berghutten(regelData[0],hoogte,regelData[2]);
            // berghuttenList.add(berghut);
            // <-->
            berghuttenList.add(new Berghutten(regelData[0],Integer.parseInt(regelData[1]),regelData[2]));
        }
        file.close();
        return berghuttenList;
    }
}
