import planten.KamerPlant;

/**
 * Van Elias De Hondt
 * 20/10/2022
 */
public class DemoKamerPlant {
    public static void main(String[] args) {
        KamerPlant plant1 = new KamerPlant("Cactus", 15.50, 15);
        KamerPlant plant2 = new KamerPlant();
        plant2.setprijs(50);

        plant1.drukAf();
        plant2.drukAf();

    }
}
