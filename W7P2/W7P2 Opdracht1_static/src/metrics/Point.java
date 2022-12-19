package metrics;

/**
 * Van Elias De Hondt
 * 14/11/2022
 */
public class Point {
    // Attributen
    private int x;
    private int y;
    public static final String COLOR = "red";
    private static int count = 0;
    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        Point.count++;
    }
    // Methode
    public int getX() { // get..
        return x;
    }
    public int getY() { // get..
        return y;
    }
    public static int getCount() { // get..
        return count;
    }
    public void setX(int x) { // set..
        this.x = x;
    }
    public void setY(int y) { // set..
        this.y = y;
    }
    public static void setCount(int count) { // set..
        Point.count = count;
    }
    @Override
    public String toString() {
        return String.format("metrics.Point (%d,%d)",this.x,this.y);
    }
}
