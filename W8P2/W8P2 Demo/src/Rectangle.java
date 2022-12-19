import geometry.Shape;

/**
 * Van Elias De Hondt
 * 21/11/2022
 */
public class Rectangle extends Shape {
    // attributen
    private int width;
    private int height;
    // Constructors
    public Rectangle() {
    }
    public Rectangle(int x, int y, int width, int height) {
        super(x,y);
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
    public double getArea() { // Area
        return this.width * this.height;
    }
    public double getPerimeter() { // Perimeter
        return 2 * (this.height + this.width);
    }
    @Override
    public String toString() { // toString
        return String.format("Rectangle (x = %d y = %d Height = %d Width = %d)",
                super.getX(),super.getY(),this.width,this.height);
    }
}
