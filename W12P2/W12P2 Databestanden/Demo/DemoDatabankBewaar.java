import Table1.*;
import Table2.*;

/**
 @author Van Elias De Hondt
 * 19/12/2022
 */
public class DemoDatabankBewaar {
    public static void main(String[] args) {
        // Huisarts data
        Huisartsen huisartsen = new Huisartsen();
        Huisarts huisarts = new Huisarts("Paulien Vermeiren");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Haron Verheyen");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Nikolai Van Wouwe");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Matthieu Saleh");
        huisartsen.insert(huisarts);

        // Patiënt data
        Patiënten patiënten = new Patiënten();
        Patiënt patiënt = new Patiënt("Flor Wan");
        patiënt.setHuisartsId(0);
        patiënten.insert(patiënt);
        patiënt = new Patiënt("Bart Matondo");
        patiënt.setHuisartsId(3);
        patiënten.insert(patiënt);
        patiënt = new Patiënt("Elias Magnus");
        patiënt.setHuisartsId(2);
        patiënten.insert(patiënt);
        patiënt = new Patiënt("Kevin Koch");
        patiënt.setHuisartsId(1);
        patiënten.insert(patiënt);
        patiënt = new Patiënt("Lien Krasnovitski");
        patiënt.setHuisartsId(0);
        patiënten.insert(patiënt);
        patiënt = new Patiënt("Kay Adib");
        patiënt.setHuisartsId(6);
        patiënten.insert(patiënt);


        patiënten.bewaar("W12P2/W12P2 Databestanden/data/patienten.csv"); // waar komt dit bestand dan terecht?
        huisartsen.bewaar("W12P2/W12P2 Databestanden/data/huisartsen.csv");
    }
}
