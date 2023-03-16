/**
 @author Van Elias De Hondt
 * 19/12/2022
 */
public class Berghutten implements Comparable<Berghutten>{
    // Attributes
    private String naam;
    private int hoogte;
    private String locatie;
    // Constructors
    public Berghutten(String naam, int hoogte, String locatie) {
        this.naam = naam;
        this.hoogte = hoogte;
        this.locatie = locatie;
    }
    // Methods
    @Override
    public String toString() { // @Override van toString
        return String.format("%-20s (%dm) --> %s",this.naam,this.hoogte,this.locatie);
    }
    @Override
    public int compareTo(Berghutten o) {
        return this.naam.compareTo(o.naam);
    }
}
