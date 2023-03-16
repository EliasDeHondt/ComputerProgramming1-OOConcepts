import geometry.Circle;

/**
 * @author Elias De Hondt
 * 21/11/2022
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1); // c1.toString
        System.out.println("Opp:" + c1.getArea());
        System.out.println("Omtr:" + c1.getPerimeter());

        Circle c2 = new Circle(1,2,3);
        System.out.println(c2); // c2.toString
        System.out.println("Opp:" + c2.getArea());
        System.out.println("Omtr:" + c2.getPerimeter());
    }
}
