

/**
 @author Elias De Hondt
 * 12/12/2022
 */
public class TestDubbels {
    // Methods
    public static void main(String[] args) {
        Dubbels dubbels = new Dubbels(Data.getData());

        System.out.println("Origineel:\n" + dubbels);
        dubbels.verwijderDubbels();
        System.out.println("\nNa verwijderen dubbels en sorteren:\n" + dubbels);
    }
}
