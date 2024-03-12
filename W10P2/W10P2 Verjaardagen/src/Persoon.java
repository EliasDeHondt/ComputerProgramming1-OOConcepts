import java.util.Comparator;

/**
 @author Elias De Hondt
 * 8/12/2022
 */
public class Persoon implements Comparable<Persoon> {
    public static class DatumComparator implements Comparator<Persoon> {
        @Override
        public int compare(Persoon o1, Persoon o2) {
            return o1.getVerjaardag().compareTo(o2.getVerjaardag());
        }
    }
    // Attributen
    private String name;
    private Datum verjaardag;
    // Constructors
    public Persoon(String name, Datum verjaardag) {
        this.name = name;
        this.verjaardag = verjaardag;
    }
    public Persoon(String name, int dag, Datum.Maand maand) {
        this.name = name;
        this.verjaardag = new Datum(dag, maand);
    }
    // Methode
    public String getName() { // Get..
        return name;
    }
    public Datum getVerjaardag() { // Get..
        return verjaardag;
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("%-7s -> %-3d %s",this.getName(),this.verjaardag.getDag(),this.verjaardag.getMaand());
    }
    @Override
    public int compareTo(Persoon tempName) {
        return this.getName().compareTo(tempName.getName());
    }
}