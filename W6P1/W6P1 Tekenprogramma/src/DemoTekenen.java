/**
 * Van Elias De Hondt
 * 3/11/2022
 */
public class DemoTekenen {
    public static void main(String[] args) {
        Rechthoek rechthoek1 = new Rechthoek(3.5,6,1);
        Rechthoek rechthoek2 = new Rechthoek(3.1,7.3,2);
        Cirkel cirkel1 = new Cirkel(5,0);
        Cirkel cirkel2 = new Cirkel(2,2);

        System.out.println(rechthoek1.toString());
        System.out.println(rechthoek2.toString());
        System.out.println(cirkel1.toString());
        System.out.println(cirkel2.toString());
    }
}
