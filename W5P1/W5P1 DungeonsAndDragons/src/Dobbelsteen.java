import java.util.Random;

/**
 @author Van Elias De Hondt
 * 17/10/2022
 */
public class Dobbelsteen {
    // Attributen
    private int zijden;

    // Constructor

    // Methode
    public void setZijden(int zijden) { // set ...
        this.zijden = zijden;
    }
    public int gooi() {
        Random random = new Random();
        int getal = random.nextInt(0, this.zijden) +1;
        return getal;
    }

}
