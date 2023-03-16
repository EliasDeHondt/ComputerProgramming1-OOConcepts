/**
 @author Van Elias De Hondt
 * 19/12/2022
 */
public class DemoGetallen {
    public static void main(String[] args) {
        try {
//            Getallen getallen1 = new Getallen();
//            getallen1.voegToe(Math.PI);
//            getallen1.voegToe(42);
//            getallen1.voegToe(1.61803);
//            getallen1.voegToe(-7);
//            Getallen getallen2 = new Getallen(getallen1);
//            double gemiddelde1 = getallen2.gemiddelde();
//            System.out.println("gemiddelde = " + gemiddelde1);
        Getallen getallen3 = new Getallen();
        getallen3.voegToe(Math.PI);
        getallen3.voegToe(Double.NaN);
        getallen3.voegToe(Double.POSITIVE_INFINITY);
        double gemiddelde2 = getallen3.gemiddelde();
        System.out.println("gemiddelde = " + gemiddelde2);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }



    }
}
