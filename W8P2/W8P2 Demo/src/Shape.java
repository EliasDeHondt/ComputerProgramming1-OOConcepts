/**
 * @author Elias De Hondt
 * 21/11/2022
 */
public class Shape {
    // Attributen
    private int x;
    private int y;
    // Constructors
    public Shape() {
    }
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Methode
    public void setX(int x) { // Set..
        this.x = x;
    }
    public void setY(int y) { // Set..
        this.y = y;
    }
    public int getX() { // Get..
        return x;
    }
    public int getY() { // Get..
        return y;
    }
    public double getArea() {
        return 0.0;
    }
    public double getPerimeter() {
        return 0.0;
    }
    @Override
    public String toString() { // toString
        return String.format("Rectangle (x = %d y = %d)",
                this.x,this.y);
    }
}
