/**
 @author Elias De Hondt
 * 14/11/2022
 */
public class TestLeden {
    public static void main(String[] args) {
        Leden leden = new Leden();

        leden.voegLidToe(new Lid(1001, "Luka", Soort.GEWOON));
        leden.voegLidToe(new Lid(1002, "Gevorg", Soort.ERELID));
        leden.voegLidToe(new Lid(1003, "Lorenzo", Soort.STEUNEND));
        leden.voegLidToe(new Lid(1004, "Pavel", Soort.GEWOON));
        leden.voegLidToe(new Lid(1005, "Sarah", Soort.GEWOON));
        leden.voegLidToe(new Lid(1006, "Noam", Soort.ERELID));

        System.out.println(leden.getAantalActieveLeden());
        System.out.println(leden.printActieveLeden());
    }
}