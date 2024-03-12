

import Table1.Patiënt;
import Table1.Patiënten;
import Table2.Huisarts;
import Table2.Huisartsen;

/**
 @author Elias De Hondt
 * 15/12/2022
 */
public class DemoDatabankje {
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
        // Schrijf code om alle patiënten te verwijderen waarvan de foreign key verkeerd staat.  Rapporteer de gevonden patiënten.
        for (int i = 0; i < 6; i++) {
            if (patiënten.findById(i).getHuisartsid() >= huisartsen.getvolgendeld()) {
                System.out.printf("Patiënt %s heeft geen geldige huisarts. Deze wordt verwijderd.\n\n",patiënten.findById(i).getNaam());
                patiënten.delete(i);
            }
        }
        // Schrijf code die alle patiënten laat zien met de naam van hun huisdokter
        // zorg voor een header en teken de tabel zoals te zien is in het voorbeeld hieronder.
        // De patiënten moeten getoond worden in de volgorde van de id’s.
        System.out.println("Alle patiënten:");
        print();
        try {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 4; j++) {
                    if (patiënten.findById(i).getHuisartsid() == huisartsen.findById(j).getId()) {
                        System.out.print(patiënten.findById(i).toString());
                        System.out.println(huisartsen.findById(j).toString());
                    }
                }
            }
        } catch (Exception ignored) {
        }
        // Schrijf code die een collection maakt van alle patiënten die bij huisarts Paulien Vermeiren zitten
        System.out.println("\nAlle patiënten bij P. Vermeiren:");
        print();
        try {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 4; j++) {
                    if (patiënten.findById(i).getHuisartsid() == huisartsen.findById(j).getId()) {
                        if (huisartsen.findById(j).getNaam().equals("Paulien Vermeiren")) {
                            System.out.print(patiënten.findById(i).toString());
                            System.out.println(huisartsen.findById(j).toString());
                        }
                    }
                }
            }
        } catch (Exception ignored) {
        }
    }
    public static void print() {
        System.out.print(
                """
                ID       | NAAM                 | HUISARTS
                ------------------------------------------------------
                """);
    }
}
