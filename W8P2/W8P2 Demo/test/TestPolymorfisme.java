import geometry.Circle;
import geometry.Rectangle;
import geometry.Shape;
import geometry.Square;

/**
 * @author Elias De Hondt
 * 24/11/2022
 */
public class TestPolymorfisme {
    public static void main(String[] args) {
        int tellerRectangle = 0;
        int tellerSquare = 0;
        int tellerCircle = 0;
    //een aantal figuren in een array:
        Shape[] figuren = {
                new Rectangle(5, 8, 1, 1),
                new Rectangle(),
                new Square(10, 45, 85),
                new Square(),
                new Circle(10, 2, 4),
                new Circle(1, 1, 1)
        };
    //eigenschappen van de elementen afdrukken:
        for (Shape figuur : figuren) {
            System.out.println(figuur.toString());
            System.out.println("\t opp: " + figuur.getArea());
            System.out.println("\t omtr: " + figuur.getPerimeter());
            if (figuur instanceof Rectangle) {
                tellerRectangle++;
                tellerSquare++;
            }
            if (figuur instanceof Square) tellerSquare++;
            if (figuur instanceof Circle) tellerCircle++;
        }
        System.out.println("Rectangles = " + tellerRectangle);
        System.out.println("Squares = " + (tellerSquare - tellerRectangle));
        System.out.println("Circles = " + tellerCircle);
    }
}
