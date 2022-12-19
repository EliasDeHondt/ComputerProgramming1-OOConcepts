/**
 * Van Elias De Hondt
 * 17/10/2022
 */
public class DemoDoos {
    public static void main(String[] args) {
        Doos doos = new Doos("Type4", 100, 20, 30);
        System.out.println(doos);
        doos = new Doos("Type3");
        System.out.println(doos);
        doos = new Doos("Dummy");
        System.out.println(doos);
    }
}