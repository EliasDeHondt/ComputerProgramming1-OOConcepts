//import Circle;
//import Rectangle;
//import Shape;
//import Square;

/**
 * @author Van Elias De Hondt
 * 28/11/2022
 */
public class TestPolymorfisme {
    public static void main(String[] args) {
        Shape[] figuren = {
                new Rectangle(5, 8, 1, 1),
                new Rectangle(),
                new Square(10, 45, 85),
                new Square(),
                new Circle(10, 2, 4),
                new Circle(1, 1, 1)};

        //eigenschappen van de elementen afdrukken:
        int squareCount = 0;
        int rectCount = 0;
        int circleCount = 0;
        for (Shape figuur : figuren) {
            System.out.println(figuur.toString());
            System.out.println("\t opp:  " + figuur.getArea());
            System.out.println("\t omtr: " + figuur.getPerimeter());
            if (figuur instanceof Square) {
                squareCount++;
            }
            if(figuur instanceof Circle) {
                circleCount++;
            }
            if (figuur instanceof Rectangle) {
                rectCount++;
            }
        }
        System.out.println("circleCount = " + circleCount);
        System.out.println("rectCount = " + rectCount);
        System.out.println("squareCount = " + squareCount);
    }
    // Shape sh = new Shape()
}

