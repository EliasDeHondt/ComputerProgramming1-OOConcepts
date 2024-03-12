import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 @author Elias De Hondt
 * 12/12/2022
 */
public class Dubbels {
    // Attributes
    private List<String> list;
    // Constructors
    public Dubbels(List<String> list) {
        this.list = list;
    }
    // Methods
    public void verwijderDubbels() {
        Set<String> tempSet = new TreeSet<>(this.list); // van List naar Set
        this.list = tempSet.stream().toList(); // van Set naar List
    }
    @Override
    public String toString() { // @Override van toString
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.list.size(); i++) {
            if (0 == i%4) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(String.format("%-12s ",this.list.get(i)));
        }
        return stringBuilder.toString();
    }
}
