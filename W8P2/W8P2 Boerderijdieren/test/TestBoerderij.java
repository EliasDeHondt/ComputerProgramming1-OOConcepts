/**
 * Van Elias De Hondt
 * 21/11/2022
 */
public class TestBoerderij {
    public static void main(String[] args) {
        Konijn bugs = new Konijn("Bugs", true);
        Koe belle = new Koe("Belle", 15.4);
        Konijn bunny = new Konijn("Bunny", false);
        Kip kiekens = new Kip("Generaal Kiekens", 3);
        Kip chick = new Kip("Chick", 4);
        Koe hannibal = new Koe("Hannibal", 0);

        // vul aan
        System.out.println(bugs);
        System.out.println(belle);
        System.out.println(bunny);
        System.out.println(kiekens);
        System.out.println(chick);
        System.out.println(hannibal);
    }
}
