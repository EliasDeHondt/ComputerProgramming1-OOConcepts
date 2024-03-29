import observatie.GeobserveerdeVogel;
import observatie.Identificeerbaar;
import vogels.Habitat;

/**
 @author Elias De Hondt
 * 19/09/2022
 */
public class TestGeobserveerdeVogel {
    public static void main(String[] args) {
        GeobserveerdeVogel[] vogelArray = {
                new GeobserveerdeVogel("Blauwe Reiger", Habitat.WEIDE, "Zuid-Spanje, Marokko", "H-31662", "Kalmthout"),
                new GeobserveerdeVogel("Boerenzwaluw", Habitat.WEIDE, "Afrika", "Z-248-44.71", "Oostmalle"),
                new GeobserveerdeVogel("Visarend", Habitat.ZEE, "Mexico", "C-8.07-212", "Canada")
        };
        vogelArray[0].setObservatie("Mannetje, angstig, verhongerd en blijkbaar verdwaald");
        vogelArray[1].setObservatie("Gewoon een zwaluw");

        for (Identificeerbaar identificeerbareVogel : vogelArray) {
            System.out.println(identificeerbareVogel);
        }
    }
}
