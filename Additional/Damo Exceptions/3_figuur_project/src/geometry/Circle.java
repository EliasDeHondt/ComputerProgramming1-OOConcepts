package geometry;

/**
 * De klasse Circle erft over van Shape
 */
public final class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("CIRCLE (x = %d, y = %d, radius = %d)",
                super.getX(), super.getY(), radius);
    }
}
