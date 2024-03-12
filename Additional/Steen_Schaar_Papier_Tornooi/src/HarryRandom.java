import steenschaarpapier.Antwoord;

import java.util.Random;

/**
 @author Elias De Hondt
 * 28/11/2022
 */
public class HarryRandom implements Deelnemer {
    // Attributen
    // Constructors
    // Methode
    @Override
    public String getNaam() {
        return "Harry Random";
    }
    @Override
    public void ditZeiTegenstander(Antwoord antwoord) {
    }
    @Override
    public Antwoord getAntwoord() {
        Random random = new Random();

        return switch (random.nextInt(1, 4)) {
            case 1 -> Antwoord.PAPIER;
            case 2 -> Antwoord.STEEN;
            case 3 -> Antwoord.SCHAAR;
            default -> null;
        };
    }
}
