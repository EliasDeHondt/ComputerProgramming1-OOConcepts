/**
 * Van Elias De Hondt
 * 5/12/2022
 */
public class TestDrank {
    // Attributen
    // Constructors
    // Methode
    public static void main(String[] args) {
        DrankKaart drankKaart = new DrankKaart();
        drankKaart.voegDrankToe(
                new Drank("Stella Artois", 2, true));
        drankKaart.voegDrankToe(
                new Drank("Cola", 2, false));
        drankKaart.voegDrankToe(
                new Drank("Sprite", 2, false));
        drankKaart.voegDrankToe(
                new Drank("Mojito", 7.5, true));
        drankKaart.voegDrankToe(
                new Drank("Plat water", 1.75, false));
        drankKaart.voegDrankToe(
                new Drank("Leffe blond", 4.55, true));
        drankKaart.voegDrankToe(
                new Drank("Leffe donker", 4.45, true));
        drankKaart.voegDrankToe(
                new Drank("Negroni", 10.5, true));
        drankKaart.voegDrankToe(
                new Drank("Fruitsap", 3.20, false));

        System.out.println(drankKaart);
        System.out.println("Duurste: " + drankKaart.duurste());
        System.out.println("Alle alc dranken: " + drankKaart.getAlcoholischeDranken());
        drankKaart.verwijderDuurderDan(5);
        System.out.println(drankKaart.toString());


//        DrankKaart drankKaart = new DrankKaart();
//
//        Drank drank0 = new Drank("Pils",2.00);
//        Drank drank1 = new Drank("Cola",2.00);
//        Drank drank2 = new Drank("Water",2.00);
//        Drank drank3 = new Drank("Gentse Strop",5.80);
//        Drank drank4 = new Drank("Gulden Draak",6.00);
//        Drank drank5 = new Drank("Gruut Amber",6.00);
//        Drank drank6 = new Drank("Gentse Strop",5.80);
//        Drank drank7 = new Drank("Omer",6.00);
//        Drank drank8 = new Drank("6.00",3.00);
//        Drank drank9 = new Drank("Glas Cava",7.00);
//
//        drankKaart.voegDrankToe(drank0);
//        drankKaart.voegDrankToe(drank1);
//        drankKaart.voegDrankToe(drank2);
//        drankKaart.voegDrankToe(drank3);
//        drankKaart.voegDrankToe(drank4);
//        drankKaart.voegDrankToe(drank5);
//        drankKaart.voegDrankToe(drank6);
//        drankKaart.voegDrankToe(drank7);
//        drankKaart.voegDrankToe(drank8);
//        drankKaart.voegDrankToe(drank9);
//
//        System.out.println(drankKaart.toString());
    }
}
