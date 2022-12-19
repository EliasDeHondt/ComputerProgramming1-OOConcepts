package wijnen;

import java.time.LocalDate;

public class Likeur extends Wijn{
    private double alcoholGehalte; //in procent

    public Likeur(String naam, String streek, LocalDate oogstDatum, double basisPrijs, double alcoholGehalte) {
        super(naam, streek, oogstDatum, basisPrijs);
        this.alcoholGehalte = alcoholGehalte;
    }

    public double getAlcoholGehalte() { // Get..
        return alcoholGehalte*100;
    }
    @Override
    public double berekenPrijs() {
        if (this.alcoholGehalte >= 50) {
            double newPrijs = (super.berekenPrijs() / 4) + super.berekenPrijs();
            return newPrijs;
        }
        return super.berekenPrijs();
    }
    @Override
    public String toString() {
        return String.format("%s --> %.0f%% alc",
                super.toString(),this.getAlcoholGehalte());
    }
}
