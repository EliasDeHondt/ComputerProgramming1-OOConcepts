import Personen.Adres;
import Personen.Model;

/**
 * @author Van Elias De Hondt
 * 21/11/2022
 */
public class TestModel {
    public static void main(String[] args) {
        Model eerste = new Model("Caroline");
        System.out.println("\nEerste model");
        System.out.println(eerste);

        Model tweede = new Model("Veronica", 102, 67, 88);
        tweede.setAdres(new Adres("Nationalestraat 5", 2000));
        System.out.println("\nTweede model");
        System.out.println(tweede);
    }
}
