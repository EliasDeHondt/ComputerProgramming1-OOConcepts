package golven;

/**
 * Van Elias De Hondt
 * 28/10/2022
 */
public class Golf {
    // Attributen
    private double amplitude;
    private double frequentie;
    private double fase;
    // Constructors
    public Golf() { // De default constructor.
        this.amplitude = 1.0;
        this.frequentie = 1.0;
        this.fase = 0.0;
    }
    // Methode
    public void setAmplitude(double amplitude) {
        if (amplitude > 0) this.amplitude = amplitude; else System.out.println("De meegegeven amplitude voldoet niet aan de criteria en is gereset naar de default waarde (1,0)!!!");
    }

    public void setFrequentie(double frequentie) {
        if(frequentie > 0) this.frequentie = frequentie; else System.out.println("De meegegeven frequentie voldoet niet aan de criteria en is gereset naar de default waarde (1,0)!!!");
    }
    public void setFase(double fase) {
        this.fase = fase;
    }
    public double getYwaarde(double x) {
        return (this.amplitude*Math.sin(this.frequentie*x+this.fase));
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("y = ");
        if (this.amplitude > 0) builder.append(String.format("%.1f * ", this.amplitude));
        builder.append("sin(");
        if (this.frequentie > 0) builder.append(String.format("%.1f * ", this.frequentie));
        builder.append("x");
        if (this.fase > 0) builder.append(String.format(" + %.1f", this.fase));
        else if (this.fase < 0) builder.append(String.format(" - %1f", this.fase));
        builder.append(")");
        return builder.toString();
    }
}
