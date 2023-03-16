import geometry.Shape;

/**
 * @author Van Elias De Hondt
 * 21/11/2022
 */
public class TestSquare {
    public static void main(String[] args) {
        Shape sh1 = new Shape();
        System.out.println(sh1); // sh1.toString


        Shape sh2 = new Shape(1,2);
        System.out.println(sh2); // sh2.toString
    }
}
