package telling;

import observatie.GeobserveerdeVogel;
import observatie.Identificeerbaar;
import vogels.TrekVogel;
import vogels.Vogel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Van Elias De Hondt
 * 19/09/2022
 */
public class VogelTelling {
    public class Overzicht {
        public void toonOverzicht() {
            DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            this.printLijn();
            System.out.printf(
            """
            Vogeltelling op %s te Sourbrodt
            Weertype: %s
            """,myFormat.format(tijdstip),weerType);
            this.printLijn();
            List<Integer> aantal = new ArrayList<>(tellingMap.values());
            List<Vogel> name = new ArrayList<>(tellingMap.keySet());
            for (int i = 0; i < tellingMap.size(); i++) {
                System.out.printf("%-15s %d\n",name.get(i).getNaam(),aantal.get(i));
            }
            this.printLijn();
            System.out.printf(
            """
            Totaal: %d exemplaren, %d soorten
            Verhouding trekvogels: %.2f%%
            """,getAantalExemplaren(),getAantalVogelNamen(),getVerhoudingTrekVogels());
            this.printLijn();
            System.out.printf("Logboek Ringinfo: %s\n",logBoek);
            this.printLijn();
        }
        public void printLijn() {
            for (int i = 0; i <= 64; i++) System.out.print('-');
            System.out.println();
        }
    }
    private String locatie;
    private LocalDateTime tijdstip;
    private String weerType;
    private String logBoek;
    private Map<Vogel,Integer> tellingMap;
    public VogelTelling(String locatie, LocalDateTime tijdstip, String weerType) {
        this.locatie = locatie;
        if (tijdstip.isBefore(LocalDateTime.now())) this.tijdstip = tijdstip;
        else throw new IllegalArgumentException("Error exception.");
        this.weerType = weerType;
        this.tellingMap = new HashMap<>();
        this.logBoek = "";
    }
    public void voegVogelToe(Vogel vogel, int aantal) {
        if (!(this.tellingMap.get(vogel) == null)) {
            aantal+=this.tellingMap.get(vogel);
        }
        this.tellingMap.put(vogel,aantal);

        if (vogel.getClass() == GeobserveerdeVogel.class) {
            this.logBoek = String.format("%s\n%s",this.logBoek,((GeobserveerdeVogel) vogel).getRingInfo());
        }
    }
    public int getAantalExemplaren() {
        Integer totaalVogels = 0;
        for (Integer vogelAantal : this.tellingMap.values()) {
            totaalVogels += vogelAantal;
        }
        return totaalVogels;
    }
    public int getAantalVogelNamen() {
        return this.tellingMap.size();
    }
    public double getVerhoudingTrekVogels() {
        double i = 0;

        for (Vogel trekvogels : this.tellingMap.keySet()) {
            if (trekvogels.getClass() == TrekVogel.class || trekvogels.getClass() == GeobserveerdeVogel.class) i++;
        }

        return i/this.tellingMap.size()*100;
    }
}
