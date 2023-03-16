import ConcreteKlassen.*;
import Transportmiddel.Transportmiddel;

/**
 @author Van Elias De Hondt
 * 28/11/2022
 */
public class DeMain {
    // Methode
    public static void main(String[] args) {
        Transportmiddel[] transportmiddelen = new Transportmiddel[] {
                new Bus(50), new Tram(40), new Trein(120), new Fiets(25),
                new TeVoet(5), new Step(20)
        };
        // schrijf hier code zodat ieder transportmiddel 10 km moet afleggen.
        for (int i = 0; i < 6; i++) {
            transportmiddelen[i].legAfstandAf(10);
        }
    }
}
