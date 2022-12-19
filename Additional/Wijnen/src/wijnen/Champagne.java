package wijnen;

import java.time.LocalDate;

public class Champagne extends Wijn {
    private Smaak smaak;

    public Champagne(String naam, String streek, LocalDate oogstDatum, double basisPrijs, Smaak smaak) {
        super(naam, streek, oogstDatum, basisPrijs);
        this.smaak = smaak;
    }

    @Override
    public double berekenPrijs() {
        if (this.smaak.toString() == "Brut"
                || this.smaak.toString() == "Extra-brut"
                || this.smaak.toString() == "Brut sans Millésime") {
            double newPrijs = ((super.berekenPrijs() / 100) *10) + super.berekenPrijs();
            return newPrijs;
        }
        return super.berekenPrijs();
    }
    @Override
    public String toString() {
        return String.format("%s --> Type: %s",
                super.toString(),this.smaak.toString());
    }
}
