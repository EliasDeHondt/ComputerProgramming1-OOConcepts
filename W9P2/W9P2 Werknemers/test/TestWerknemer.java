import Bedrijf.Arbeider;
import Bedrijf.Bediende;
import Bedrijf.Werknemers;


/**
 @author Elias De Hondt
 * 21/11/2022
 */
public class TestWerknemer {
    public static void main(String[] args) {
        double somLonen = 0;
        Werknemers[] werknemers = {
                new Arbeider("Jos", 57082332149L, 38),
                new Arbeider("Els", 61030350468L, 40),
                new Bediende("Erik", 54110774131L, 1.6)
        };
        //Vul hier aan...
        for (Werknemers werknemer : werknemers) {
            System.out.println(werknemer);
            somLonen = somLonen + werknemer.getLoon();
        }
        System.out.printf("Som lonen: %.1f",somLonen);
    }
}
