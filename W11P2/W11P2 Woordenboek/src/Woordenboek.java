import java.util.Map;
import java.util.TreeMap;

/**
 @author Van Elias De Hondt
 * 15/12/2022
 */
public class Woordenboek {
    // Attributes
    private Map<String,String> map;
    // Constructors
    public Woordenboek() {
        map = new TreeMap<>();
    }
    // Methods
    public void voegWoordToe(String woord, String vertaling) {
        this.map.put(woord,vertaling);
    }
    public String vertaal(String woord) {
        if (this.map.containsKey(woord)) return this.map.get(woord);
        else return "Vertaling niet gevonden";
    }
    public int  aantalWoorden() {
        return this.map.size();
    }
}
