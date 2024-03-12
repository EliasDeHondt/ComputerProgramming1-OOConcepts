package observatie;

import vogels.Habitat;
import vogels.TrekVogel;

/**
 @author Elias De Hondt
 * 19/09/2022
 */
public class GeobserveerdeVogel extends TrekVogel implements Identificeerbaar {
    private String ringId;
    private String ringLocatie;
    private String observatie;
    public GeobserveerdeVogel(String naam, Habitat habitat, String bestemming, String ringId, String ringLocatie) {
        super(naam, habitat, bestemming);
        this.ringId = ringId;
        this.ringLocatie = ringLocatie;
        this.observatie = "nihil";
    }
    public String getObservatie() { // Get..
        return this.observatie;
    }
    public void setObservatie(String observatie) { // Set..
        this.observatie = observatie;
    }
    @Override
    public String getRingInfo() {
        StringBuilder newString = new StringBuilder();
        if (!this.observatie.equals("nihil")) newString.append("OBS: \"").append(this.observatie);
        if (newString.length() > 26) newString.replace(26,newString.length(),"...");

        if (!this.observatie.equals("nihil")) newString.append("\"");
        return String.format("ID: %-15s LOC: %-10s %s",this.ringId,this.ringLocatie,newString);
    }
    @Override
    public String toString() {
        return String.format("%-15s Ringinfo: %s",super.getNaam(),this.getRingInfo());
    }
}
