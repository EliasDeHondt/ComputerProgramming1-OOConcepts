/**
 * @author Elias De Hondt
 * 10/10/2022
 */
public class Vat {
    private double inhoud;
    private double capaciteit;

    public Vat(double deCapaciteit) {
        if (deCapaciteit < 0) {
            System.out.println("De capaciteit moet positief zijn!");
            capaciteit = 0;
        } else {
            capaciteit = deCapaciteit;
        }
    }

    public double getInhoud() {
        return inhoud;
    }

    public double getCapaciteit() {
        return capaciteit;
    }

    public void vul(double hoeveelheid) {
        if (hoeveelheid < 0) {
            System.out.println("De bij te vullen hoeveelheid mag niet negatief zijn!");
        } else {
            if ((inhoud + hoeveelheid) > capaciteit) {
                inhoud = capaciteit;
                System.out.println("Het vat loopt over!");
            } else {
                inhoud += hoeveelheid;
            }
        }
    }

    public void vulVolledig() {
        inhoud = capaciteit;
    }

    public boolean isVol() {
        return inhoud == capaciteit;
    }

    public void verwijder(double hoeveelheid) {
        if (hoeveelheid < 0) {
            System.out.println("De bij te vullen hoeveelheid mag niet negatief zijn !");
        } else {
            if (hoeveelheid > inhoud) {
                inhoud = 0;
            } else {
                inhoud -= hoeveelheid;
            }
        }
    }

    public void maakLeeg() {
        inhoud = 0;
    }

    public double getPercentageGevuld() {
        double percent = 0.0;
        if (capaciteit == 0) {
            System.out.println("Onbepaald, de capaciteit is 0!");
        } else {
            percent = inhoud * 100.0 / capaciteit;
        }
        return percent;
    }
}
