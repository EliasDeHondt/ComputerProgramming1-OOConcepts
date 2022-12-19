import geometry.Shape;

/**
 * Van Elias De Hondt
 * 21/11/2022
 */
public class Circle extends Shape {
    // Attributen
    private int radius;
    // Constructors
    public Circle() {
    }
    public Circle(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }
    // Methode
    public void setRadius(int radius) { // Set..
        this.radius = radius;
    }
    public int getRadius() { // Get..
        return radius;
    }
    public double getArea() { // Area
        return Math.PI * (this.radius*this.radius);
    }
    public double getPerimeter() { // Perimeter
        return 2 * Math.PI * (this.radius);
    }
    @Override
    public String toString() { // toString
        return String.format("Rectangle (x = %d y = %d Radius = %d)",
                super.getX(),this.getY(),this.radius);
    }
}
