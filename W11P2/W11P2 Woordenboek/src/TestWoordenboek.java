/**
 @author Elias De Hondt
 * 15/12/2022
 */
public class TestWoordenboek {
    public static void main(String[] args) {
        Woordenboek woordenboek = WoordenboekCreator.maakWoordenboek();

        System.out.println("Mijn Fins woordenboek:");
        System.out.println("Aantal woorden: " + woordenboek.aantalWoorden());
        System.out.println("een - " + woordenboek.vertaal("een"));
        System.out.println("drie - " + woordenboek.vertaal("drie"));
        System.out.println("zeven - " + woordenboek.vertaal("zeven"));
        System.out.println("twaalf - " + woordenboek.vertaal("twaalf"));
    }
}
