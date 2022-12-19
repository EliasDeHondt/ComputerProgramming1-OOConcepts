/**
 * Van Elias De Hondt
 * 3/11/2022
 */
public class Auto {
    // Attributen
    private String merk;
    private String type;
    private int fiscaalVermogen;

    // Constructors
    // Methode
    //public double berekenVerkeersbelasting() {
    //    return x
    //}
    public void setMerk(String merk){ // Set..
        this.merk=merk;
    }
    public void setType(String type) {// Set..
        this.type=type;
    }
    public void setFiscaalVermogen(int fiscaalVermogen) { // Set..
        this.fiscaalVermogen=fiscaalVermogen;
    }
    public String getMerk(){ // Get..
        return this.merk;
    }
    public String getType() { // Get..
        return this.type;
    }
    public int getFiscaalVermogen() { // Get..
        return this.fiscaalVermogen;
    }
}
