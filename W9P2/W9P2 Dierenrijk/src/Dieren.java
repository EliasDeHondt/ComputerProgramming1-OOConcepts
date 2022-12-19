/**
 * Van Elias De Hondt
 * 28/11/2022
 */
public class Dieren {
    // Attributen
    private Dier dier[] = new Dier[100];
    private int aantal;
    // Constructors
    public Dieren() {
    }
    // Methode
    public void voegToe(Dier dier) {
        if (this.aantal <= this.dier.length) {
            this.dier[this.aantal] = dier;
            this.aantal++;
        }
    }
    public String toon() {
        for (int i = 0; i < this.dier.length; i++) {
            return  this.dier[i].toString();
        }
        return "";
    }
}
