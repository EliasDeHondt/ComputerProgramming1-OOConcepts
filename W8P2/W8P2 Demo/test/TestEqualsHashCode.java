import geometry.Square;

/**
 * Van Elias De Hondt
 * 24/11/2022
 */
public class TestEqualsHashCode {
    // Methode
    public static void main(String[] args) {
        // Zonder @Override van ".equals()" en ".hashCode()"
        // Maken van s1 (Square)
        Square s1 = new Square(1,2,3);
        // Maken van s2 (Square)
        Square s2 = new Square(1,2,3);
        // s1 is s2?
        System.out.println(s1.equals(s2)); // False
        // s2 is s1?
        System.out.println(s2.equals(s1)); // False


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());



        // Met @Override van ".equals()" en ".hashCode()"
        // Maken van s1 (Square)
        Square s3 = new Square(1,2,3);
        // Maken van s2 (Square)
        Square s4 = new Square(1,2,3);
        // s3 is s4?
        System.out.println(s3.equals(s4)); // True
        // s4 is s3?
        System.out.println(s4.equals(s3)); // True
    }
}
