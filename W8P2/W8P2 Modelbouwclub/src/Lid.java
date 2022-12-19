

/**
 * Van Elias De Hondt
 * 24/11/2022
 */
public class Lid {
    // Attributen
    private String naam;
    private long nummer;
    // Constructors
    public Lid(String naam, long nummer) {
        this.naam = naam;
        this.nummer = nummer;
    }
    // Methode
    public String getNaam() { // Get..
        return naam;
    }
    public long getNummer() { // Get..
        return nummer;
    }
    @Override
    public boolean equals(Object o) { // @Override van equals
        if (this == o) return true;
        if (!(o instanceof Lid lid)) return false;

        return nummer == lid.nummer;
    }
    @Override
    public int hashCode() { // @Override van hashCode
        return 0;
    }
    @Override
    public String toString() { // @Override van toString
        return this.naam;
    }
}
