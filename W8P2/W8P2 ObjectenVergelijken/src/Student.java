/**
 @author Elias De Hondt
 * 24/11/2022
 */
public class Student {
    // Attributen
    private String naam;
    private int nummer;
    // Constructors
    public Student(String naam, int nummer) {
        this.naam = naam;
        this.nummer = nummer;
    }
    // Methode
    public void setNaam(String naam) { // Set..
        this.naam = naam;
    }
    public void setNummer(int nummer) { // Set..
        this.nummer = nummer;
    }
    public String getNaam() { // Get..
        return naam;
    }
    public int getNummer() { // Get..
        return nummer;
    }
    // @Override van equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (nummer != student.nummer) return false;
        return naam.equals(student.naam);
    }
    // @Override van toString
    @Override
    public int hashCode() {
        int result = naam.hashCode();
        result = 31 * result + nummer;
        return result;
    }
}
