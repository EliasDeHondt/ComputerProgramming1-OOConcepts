/**
 @author Van Elias De Hondt
 * 14/11/2022
 */
public class DeMain {
    public static void main(String[] args) {
        // Maakt random kaart.
        Kaart kaart1 = new Kaart();
        Kaart kaart2 = new Kaart();
        Kaart kaart3 = new Kaart();
        Kaart kaart4 = new Kaart();
        Kaart kaart5 = new Kaart();

        // Print random kaart.
        System.out.println(kaart1.toString());
        System.out.println(kaart2.toString());
        System.out.println(kaart3.toString());
        System.out.println(kaart4.toString());
        System.out.println(kaart5.toString());
        System.out.println("\nTotale waarde: " + Kaart.getTotaalWaarde());
    }
}
