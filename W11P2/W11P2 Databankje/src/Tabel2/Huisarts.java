package Tabel2;

/**
 @author Van Elias De Hondt
 * 15/12/2022
 */
public class Huisarts {
    // Attributes
    private int id;
    private String naam;
    // Constructors
    public Huisarts(String naam) {
        this.id = 0;
        this.naam = naam;
    }
    // Methods
    public void setId(int id) { // Set..
        this.id = id;
    }
    public int getId() { // Get..
        return this.id;
    }
    public String getNaam() { // Get..
        return this.naam;
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("| %s",this.getNaam());
    }
}
