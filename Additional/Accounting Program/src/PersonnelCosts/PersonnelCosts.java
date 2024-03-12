package PersonnelCosts;

/**
 @author Elias De Hondt
 * 28/12/2022
 */
public class PersonnelCosts {
    // Attributes
    private final double brutobezoldiging;
    private double belastbareBezoldiging;
    private double bedrijfsvoorheffing;
    private double nettobezoldiging;
    private double ratio;

    // Constructors
    public PersonnelCosts(double brutobezoldiging, double bedrijfsvoorheffing) {
        this.brutobezoldiging = brutobezoldiging;
        this.bedrijfsvoorheffing = bedrijfsvoorheffing;
    }

    // Methods
    public void setBelastbareBezoldiging(double belastbareBezoldiging) { // Set..
        this.belastbareBezoldiging = belastbareBezoldiging;
    }

    public void setBedrijfsvoorheffing(double bedrijfsvoorheffing) { // Set..
        this.bedrijfsvoorheffing = bedrijfsvoorheffing;
    }

    public void setNettobezoldiging(double nettobezoldiging) { // Set..
        this.nettobezoldiging = nettobezoldiging;
    }

    public void setRatio(double ratio) { // Set..
        this.ratio = ratio;
    }

    public double getBrutobezoldiging() { // Get..
        return brutobezoldiging;
    }

    public double getBelastbareBezoldiging() { // Get..
        return belastbareBezoldiging;
    }

    public double getBedrijfsvoorheffing() { // Get..
        return bedrijfsvoorheffing;
    }

    public double getNettobezoldiging() { // Get..
        return nettobezoldiging;
    }

    public double getRatio() { // Get..
        return ratio;
    }
}
