import geometry.Rectangle;

/**
 * Van Elias De Hondt
 * 21/11/2022
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1); // r1.toString
        System.out.println("Opp:" + r1.getArea());
        System.out.println("Omtr:" + r1.getPerimeter());

        Rectangle r2 = new Rectangle(1,2,3,4);
        System.out.println(r2); // r2.toString
        System.out.println("Opp:" + r2.getArea());
        System.out.println("Omtr:" + r2.getPerimeter());
    }
}
