import java.util.Objects;

/**
 @author Elias De Hondt
 * 24/11/2022
 */
public class Boerderij {
    // Attributen
    private Boerderijdieren dieren[];
    private int aantalDieren;
    // Constructors
    public Boerderij() {
        this.dieren = new Boerderijdieren[5];
        this.aantalDieren = 0;
    }
    // Methode
    public void voegDierToe(Boerderijdieren dier) {
        if (aantalDieren >= 5) {
            System.out.printf("Er is geen plaats meer voor %s.  De stal zit vol!\n",
                    dier.getNaam());
        } else {
            this.dieren[aantalDieren] = dier;
            aantalDieren++;
        }
    }
    public void toonDieren() {
        for (int i = 0; i <= this.aantalDieren-1; i++) {
            System.out.println(dieren[i].toString());
        }
    }
    public void toonGeluiden() {
        for (int i = 0; i <= this.aantalDieren-1; i++) {
            System.out.printf("%s maakt geluid \"%s\"\n",
                    dieren[i].getNaam(),dieren[i].getGeluid());
        }
    }
    public void toonVoeding() {
        for (int i = 0; i <= this.aantalDieren-1; i++) {
            System.out.printf("%s eet %s\n",
                    dieren[i].getNaam(),dieren[i].getVoeding());
        }
    }
    public Boerderijdieren zoekDierOpNaam(String naam) {
        for (int i = 0; i <= this.aantalDieren-1; i++) {
            if (Objects.equals(dieren[i].getNaam(), naam)) return dieren[i];
        }
        return null;
    }
}
