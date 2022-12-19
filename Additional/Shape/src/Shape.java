/**
 * Van Elias De Hondt
 * 28/11/2022
 */
public abstract class Shape implements Printable,Scalable {
    private int x;
    private int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("SHAPE (x = %d, y = %d)",
                x, y);
    }

    @Override
    public void printOnScreen() {
        System.out.println(this);
    }
}
