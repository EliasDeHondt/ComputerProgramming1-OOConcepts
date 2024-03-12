import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 @author Elias De Hondt
 * 5/12/2022
 */
public class DrankKaart {
    // Attributen
    private LinkedList<Drank> drankdList;
    // Constructors
    public DrankKaart() {
        drankdList = new LinkedList<>();
    }
    // Methode
    public void voegDrankToe(Drank newDrank) {
        drankdList.add(newDrank);

    }
    public int getAantal() {
        return drankdList.size();
    }
    public double getTotaleprijs() {
        double Totaleprijs = 0;
        for (Drank drank : drankdList) {
            Totaleprijs = Totaleprijs + drank.getPrijs();
        }
        return Totaleprijs;
    }
    public double duurste() {
        double duurste = 0; // Kan ook --> drankdList.get(0).getPrijs();
        for (Drank drank : drankdList) {
            if (drank.getPrijs() > duurste) {
                duurste = drank.getPrijs();
            }
        }
        return duurste;
    }
    public List<Drank> getAlcoholischeDranken() {
        List<Drank> Alcoholis = new LinkedList<>();
        for (Drank drank : drankdList) {
            if (drank.isAlcoholisch()) {
                Alcoholis.add(drank);
            }
        }
        return Alcoholis;
    }
    public void verwijderDuurderDan(double duursteDan) {
        for (Iterator<Drank> it = drankdList.iterator(); it.hasNext(); ) {
            Drank next = it.next();
            if (next.getPrijs() > duursteDan) {
                it.remove();
            }
        }
    }
//    public void voegDrankenToe(Drank[] dranken) {
//
//    }
    @Override
    public String toString() { // @Override van toString
        return String.format("Kaart: %s",drankdList.toString());
    }
}
