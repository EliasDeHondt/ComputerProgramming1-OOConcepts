package Tabel1;

/**
 @author Van Elias De Hondt
 * 15/12/2022
 */
public class Patiënt {
    // Attributes
    private int id;
    private String naam;
    private int huisartsid;
    // Constructors
    public Patiënt(String naam) {
        this.huisartsid = 0;
        this.naam = naam;
        this.id = 0;
    }
    // Methods
    public void setId(int id) { // Set..
        this.id = id;
    }
    public void setHuisartsId(int huisartsid) { // Set..
        this.huisartsid = huisartsid;
    }
    public int getId() { // Get..
        return this.id;
    }
    public String getNaam() { // Get..
        return this.naam;
    }
    public int getHuisartsid() { // Get..
        return this.huisartsid;
    }
    @Override
    public String toString() { // @Override van toString
        return String.format(" %7d | %-21s",this.getId(),this.getNaam());
    }
}
