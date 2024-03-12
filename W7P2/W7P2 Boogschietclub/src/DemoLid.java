/**
 @author Elias De Hondt
 * 14/11/2022
 */
public class DemoLid {
    public static void main(String[] args) {
        Lid[] leden = {
                new Lid("Murtadha"),
                new Lid("Bart"),
                new Lid("Alikhan"),
                new Lid("Emma"),
                new Lid("Bo"),
                new Lid("Dachi")};
        for (Lid lid : leden) {
            System.out.println(lid);
        }
        System.out.println("Het volgende lidnummer is: " + Lid.getVolgendLidNr());
    }
}
