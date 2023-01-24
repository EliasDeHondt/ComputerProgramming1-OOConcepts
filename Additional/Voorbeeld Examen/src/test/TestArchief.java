import klassement.*;
import klassement.archiefstukken.Archiefstuk;
import klassement.archiefstukken.Boek;
import klassement.archiefstukken.Kaart;
import klassement.archiefstukken.Videoband;
import klassement.exceptions.ArchiveringsException;

import java.util.Random;

public class TestArchief {
    public static void main(String[] args) {
        Archief archief = new Archief(200, 100);
        boolean var1 = true;
        try {
            do {
                archief.stockeer(TestArchief.maakRandomArchiefStuk());
            } while (var1);

        } catch (ArchiveringsException exception) {
            System.out.println(exception);
            var1 = false;
        } finally {
            System.out.println(archief);
        }
    }
    public static Archiefstuk maakRandomArchiefStuk() {
        Random random = new Random();
        return switch (random.nextInt(0,3)) {
            case 0 -> new Boek();
            case 1 -> new Kaart();
            default -> new Videoband();
        };
    }
    /*
     Inhoud archief:
     Aantal gebruikte dozen: 95
     Aantal gebruikte kokers: 100
     boek (2016-12-07 09:50:55, 20p, 0.01m³)
     boek (2016-12-07 09:50:55, 25p, 0.01m³)
     boek (2016-12-07 09:50:55, 42p, 0.02m³)
     boek (2016-12-07 09:50:55, 44p, 0.02m³)
     // ........
     boek (2016-12-07 09:50:55, 949p, 0.35m³)
     boek (2016-12-07 09:50:55, 968p, 0.35m³)
     boek (2016-12-07 09:50:55, 979p, 0.36m³)
     boek (2016-12-07 09:50:55, 993p, 0.36m³)
     boek (2016-12-07 09:50:55, 997p, 0.36m³)
     boek (2016-12-07 09:50:55, 1000p, 0.37m³)
     boek (2016-12-07 09:50:55, 1009p, 0.37m³)
     */
}