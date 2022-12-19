package formulas;

/**
 * Van Elias De Hondt
 * 20/10/2022
 */
public class Graphic {
    // Attributen
    private double minimum;
    private double maximum;

    // Constructor
    public Graphic(double minimum, double maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    // Methode
    public String getSinus() {
        // Curve Sinus
        // 10*sin(x)+10
        String str = " ";
        for (double x = this.minimum; x < this.maximum; x += (this.maximum - this.minimum) / 20) {
            double y = 10 * Math.sin(x)+10;
            for (int i = 0; i < (int) y; i++) {
                str += " ";
            }
            str += "*\n";
        }
        return str;
    }
    public String getCosinusHyberbolicus() {
        // Curve Cosinus Hyberbolicus
        // 10*cosh(x)
        String str = " ";
        for (double x = this.minimum; x < this.maximum; x += (this.maximum - this.minimum) / 20) {
            double y = 10 * Math.cosh(x);
            for (int i = 0; i < (int) y; i++) {
                str += " ";
            }
            str += "*\n";
        }
        return str;
    }
    public String getWortel() {
        // Curve Wortel
        // wortel(10*x)
        String str = " ";
        for (double x = this.minimum; x < this.maximum; x += (this.maximum - this.minimum) / 20) {
            double y = Math.sqrt(10*x);
            for (int i = 0; i < (int) y; i++) {
                str += " ";
            }
            str += "*\n";
        }
        return str;
    }
}