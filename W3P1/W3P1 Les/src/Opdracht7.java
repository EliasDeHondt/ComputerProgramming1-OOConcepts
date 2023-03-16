/**
 * @author Van Elias De Hondt
 * 3/10/2022
 */
public class Opdracht7 {
    public static void main(String[] args) {
        int max = 10;
        for (int i =1; i <= 10; ++i) {
            for (int getal = i; getal <= max; getal += i) {
                System.out.print(getal + "\t");
            }
            max += 10;
            System.out.print("\n");
        }
    }
}
