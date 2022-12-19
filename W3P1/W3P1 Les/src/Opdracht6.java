/**
 * Van Elias De Hondt
 * 3/10/2022
 */
public class Opdracht6 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10000; ++i) {
            if (0 == i%6 && 0 == i%28){
                System.out.println(i);
            }
        }
    }
}