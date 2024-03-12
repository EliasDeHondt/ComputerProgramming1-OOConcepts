import Table1.*;
import Table2.*;

/**
 @author Elias De Hondt
 * 19/12/2022
 */
public class DemoDatabankLees {
    public static void main(String[] args) {
        Patiënten patiënten = new Patiënten();
        Huisartsen huisartsen = new Huisartsen();
        patiënten.lees("W12P2/W12P2 Databestanden/data/patienten.csv");
        huisartsen.lees("W12P2/W12P2 Databestanden/data/huisartsen.csv");
        for (int i = 0; i < 6; i++) {
            if (patiënten.findById(i).getHuisartsid() >= huisartsen.getvolgendeld()) {
                patiënten.delete(i);
            }
        }
        System.out.println("patiënten:\n----------");
        System.out.println(patiënten.toString());
        System.out.println("\nhuisartsen:\n-----------");
        System.out.println(huisartsen.toString());
    }
}
