package vogels;

/**
 @author Elias De Hondt
 * 19/09/2022
 */
public final class StandVogel extends Vogel{
    private String extraInfo;
    public StandVogel(String naam, Habitat habitat, String extraInfo) {
        super(naam, habitat);
        this.extraInfo = extraInfo;
    }
    @Override
    public String toString() {
        return String.format("%s %-10s",super.toString(),super.verblijftIn());
    }
}
