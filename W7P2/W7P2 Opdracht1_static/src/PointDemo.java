import metrics.Point;

import static metrics.Point.COLOR;
import static metrics.Point.getCount;

public class PointDemo {
    public static void main(String[] args) {
        Point point1 = new Point(4,12);
        System.out.println(point1);
        Point point2 = new Point(4,11);
        System.out.println(point2);
        System.out.println("kleur: " + Point.COLOR);
        System.out.println("aantal: " + Point.getCount());
        // ================================================
        // Extra
        // import static metrics.Point.*;
        Point point3 = new Point(4,12);
        System.out.println(point1);
        Point point4 = new Point(4,11);
        System.out.println(point2);
        System.out.println("kleur: " + COLOR);
        System.out.println("aantal: " + getCount());
    }
}