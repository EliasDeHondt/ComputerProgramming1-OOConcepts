/**
 @author Van Elias De Hondt
 * 24/11/2022
 */
public class Student extends Persoon{
    // Attributen
    private int nummer;
    // Constructors
    public Student(Telefoon telefoon, String naam, int nummer) {
        super(telefoon, naam);
        this.nummer = nummer;
    }
    // Methode
    @Override
    public String toString() { // @Override van toString
        return String.format("%s (%s):%s",
                super.getNaam(),this.nummer,super.getTelefoon().toString());
    }
}
