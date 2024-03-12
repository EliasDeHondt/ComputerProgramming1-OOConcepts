import java.util.Random;

/**
 @author Elias De Hondt
 * 14/11/2022
 */
public class Kaart {
    // Attributen
    private String kaartKleur;
    private int kaartWaarde;
    private String randomKaart;
    private static int totaalWaarde;
    // Constructor
    public Kaart(String kaartKleur, int kaartWaarde) {
        this.kaartKleur = kaartKleur;
        this.kaartWaarde = kaartWaarde;
    }
    public Kaart() { // Default constructor
        Random random = new Random();
        StringBuilder randomKaart = new StringBuilder();

        // Random Kleur van class KaartKleur
        int getal1 = random.nextInt(0,3);
        for (KaartKleur randomKleur : KaartKleur.values()) {
            if (getal1 == randomKleur.ordinal()) {
                randomKaart.append(randomKleur.name().toLowerCase()).append(" ");
            }
        }

        // Random waarde van class KaartWaarde
        int getal2 = random.nextInt(0,12);
        for (KaartWaarde randomWaarde : KaartWaarde.values()) {
            if (getal2 == randomWaarde.ordinal()) {
                randomKaart.append(randomWaarde.name().toLowerCase()).append(" (").append(randomWaarde.getKaartWaarde()).append(")");
                this.totaalWaarde = this.totaalWaarde + randomWaarde.getKaartWaarde();
            }
        }
        this.randomKaart = randomKaart.toString();
    }
    // Methode
    public String getKaartKleur() { // Get ...
        return kaartKleur;
    }
    public int getKaartWaarde() { // Get ...
        return kaartWaarde;
    }
    public static int getTotaalWaarde() {
        return totaalWaarde;
    }

    @Override
    public String toString() {
        return String.format("%s", this.randomKaart);
    }
}
