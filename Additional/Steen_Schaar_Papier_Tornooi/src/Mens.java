import steenschaarpapier.Antwoord;

import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 28/11/2022
 */
public class Mens implements Deelnemer {
    // Attributen
    private String naam;
    private Scanner key = new Scanner(System.in);
    // Constructors
    // Methode
    @Override
    public String getNaam() {
        return "Elias";
    }
    @Override
    public void ditZeiTegenstander(Antwoord antwoord) {
    }
    @Override
    public Antwoord getAntwoord() {
            System.out.println("(STEEN/SCHAAR/PAPIER)");
            String antwoord = key.next();
            if (antwoord.equalsIgnoreCase(Antwoord.STEEN.name())) return Antwoord.STEEN;
            else if (antwoord.equalsIgnoreCase(Antwoord.PAPIER.name())) return Antwoord.PAPIER;
            else if (antwoord.equalsIgnoreCase(Antwoord.SCHAAR.name())) return Antwoord.SCHAAR;
            else this.getAntwoord();
        return null;
    }
}
