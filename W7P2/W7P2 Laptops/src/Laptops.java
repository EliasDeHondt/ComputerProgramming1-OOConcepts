/**
 * @author Van Elias De Hondt
 * 14/11/2022
 */
public class Laptops {
    // Attributen
    private static Laptop[] laptops;
    private static int aantal;
    // Constructor
    public Laptops() {
        laptops = new Laptop[2000];
        Laptops.aantal = 0;
    }
    // Methods
    public void voegToe(Laptop laptop) {
        laptops[aantal++] = laptop;
    }
    public static int getAantal() { // Get...
        return aantal;
    }
    public static Laptop getLaptop(int index) {
        return laptops[index];
    }
}
