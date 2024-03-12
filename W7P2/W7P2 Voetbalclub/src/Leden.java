/**
 @author Elias De Hondt
 * 14/11/2022
 */
public class Leden {
    // Attributen
    private static final int  MAXCAPACITEIT = 100;
    private Lid ledenLijst[];
    private int aantal;
    // Constructor
    public Leden() { // Default constructor
        this.ledenLijst = new Lid[MAXCAPACITEIT];
        this.aantal = 0;
    }
    // Methode
    public void voegLidToe(Lid lid) {
        if (aantal < MAXCAPACITEIT) this.ledenLijst[aantal++] = lid;
    }
    public Lid getLid(int index) {
        if (index >= 0 && index <= MAXCAPACITEIT) return this.ledenLijst[index];
        else return null;
    }
    public int getAantal() { // Get ...
        return aantal;
    }
    public String getAantalActieveLeden() {
        int teller = 0;
        for (int i = 0; i < this.aantal; i++) {
            if (this.ledenLijst[i].getSoort() == Soort.STEUNEND) teller++;
        }
        return ("Aantal (niet) actieve leden: " + teller);
    }
    public String printActieveLeden() {
        StringBuilder stringBuilder = new StringBuilder();
        int teller = 0;

        for (int i = 0; i < this.aantal; i++) {
            if (this.ledenLijst[i].getSoort() != Soort.STEUNEND) {
                teller++;
                stringBuilder.append(this.ledenLijst[i].toString() + " \n");
            }

        }
        return String.format("Aantal actieve leden: %d \n%s", teller, stringBuilder);
    }
}
