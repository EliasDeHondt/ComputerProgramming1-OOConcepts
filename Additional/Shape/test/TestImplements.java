//import Circle;
//import Rectangle;
//import Shape;
//import Square;

/**
 * @author Elias De Hondt
 * 28/11/2022
 */
public class TestImplements {
    // Methode
    public static void main(String[] args) {
        Shape[] figuren = {
                new Rectangle(5, 8, 1, 1),
                new Rectangle(),
                new Square(10, 45, 85),
                new Square(),
                new Circle(10, 2, 4),
                new Circle(1, 1, 1)};

        System.out.println("Test 1");
        for (Shape shape : figuren) {
            shape.printOnScreen();
        }
        System.out.println("Test 2");
        for (Shape shape : figuren) {
            shape.halfTheSize();
            shape.printOnScreen();
        }


    }
}
