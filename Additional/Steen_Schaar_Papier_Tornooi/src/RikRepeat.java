import steenschaarpapier.Antwoord;

/**
 @author Elias De Hondt
 * 28/11/2022
 */
public class RikRepeat implements Deelnemer {
    // Attributen
    private Antwoord antwoord = Antwoord.SCHAAR;
    // Constructors
    // Methode
    @Override
    public String getNaam() {
        return "Rik Repeat";
    }
    @Override
    public void ditZeiTegenstander(Antwoord antwoord) {
        this.antwoord = antwoord;
    }
    @Override
    public Antwoord getAntwoord() {
        return this.antwoord;
    }
}
