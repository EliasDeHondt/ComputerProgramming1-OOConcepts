import steenschaarpapier.Antwoord;

/**
 @author Elias De Hondt
 * 28/11/2022
 */
public class JefPapier implements Deelnemer  {
    // Attributen
    // Constructors
    // Methode
    @Override
    public String getNaam() {
        return "Jef Papier";
    }
    @Override
    public void ditZeiTegenstander(Antwoord antwoord) {
    }
    @Override
    public Antwoord getAntwoord() {
        return Antwoord.PAPIER;
    }
}
