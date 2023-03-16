/**
 @author Van Elias De Hondt
 * 17/10/2022
 */
public class Doos {
    // Attributen
    private String type;
    private double lengte;
    private double breedte;
    private double hoogte;

    // Constructor
    public Doos(String type, double lengte, double breedte, double hoogte) {
        this.type = type;
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoogte = breedte;
    }
    public Doos(String type) {
        switch (type) {
            case "Type1": this.type = "Type1"; this.lengte = 100; this.breedte = 50; this.hoogte = 50; break;
            case "Type2": this.type = "Type2"; this.lengte = 50; this.breedte = 25; this.hoogte = 25; break;
            case "Type3": this.type = "Type3"; this.lengte = 25; this.breedte = 12.5; this.hoogte = 12.5; break;
            default:
                System.out.println("Type is niet juist!");
        }
    }

    // Methode
    public double oppervlakte() {
        return this.lengte * this.breedte;
    }
    public double volume() {
        return (this.lengte * this.breedte) * this.hoogte;
    }
    public double tapeLengte() {
        return (this.lengte * 2) + (this.hoogte * 2);
    }
    public String toString() {
        return String.format("Doos van het type %s :\n %.1f * %.1f * %.1f \noppervlakte: %.1f\nvolume: %.1f\ntape lengte: %.1f", this.type, this.lengte, this.breedte, this.hoogte, oppervlakte(), volume(), tapeLengte());
    }
}
