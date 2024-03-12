/**
 @author Elias De Hondt
 * 24/11/2022
 */
public class Rechthoek {
    // Attributen
    private int width;
    private int height;
    // Constructors
    public Rechthoek(int width, int height) {
        this.width = width;
        this.height = height;
    }
    // Methode
    public void setWidth(int width) { // Set..
        this.width = width;
    }
    public void setHeight(int height) { // Set..
        this.height = height;
    }
    public int getWidth() { // Get..
        return width;
    }
    public int getHeight() { // Get..
        return height;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rechthoek rechthoek)) return false;

        if (width != rechthoek.width) return false;
        return height == rechthoek.height;
    }
    @Override
    public int hashCode() {
        int result = width;
        result = 31 * result + height;
        return result;
    }
    @Override
    public String toString() {
        return String.format("rechthoek met lengte %s en breedte %s",
                this.width,this.height);
    }
}
