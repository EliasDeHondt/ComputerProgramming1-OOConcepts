import static java.lang.String.format;

/**
 @author Elias De Hondt
 * 20/10/2022
 */
public class Getal {
    // Attributen
    private int getal;

    // Constructor
    public Getal(int getal) {
        this.getal = getal;
    }

    // Methode
    public boolean isPerfect() {
        int som = 0;
        for (int i = 1; i < this.getal; i++) {
            if (this.getal%i == 0) {
                som+=i;
            }
        }
        return this.getal == som;
    }
    public String getDelers() {
        String str = format("%4d --> ", this.getal);
        for (int i = 1; i < this.getal; i++) {
            if (this.getal%i == 0) {
                str += format("%4d ", i);
            }
        }
        return str;
    }
}
