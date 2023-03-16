/**
 * @author Elias De Hondt
 * 3/10/2022
 */
public class Opdracht5 {
    public static void main(String[] args) {
        for (int getal = 120; getal >= 100; --getal) {
            System.out.print(getal + " ");
        }
        System.out.println("\n");
        for (int veelvouden = 3; veelvouden < 50; veelvouden += 3) {
            System.out.print(veelvouden + " ");
        }
        System.out.println("\n");
        for (int machten = 1; machten < 10000; machten *= 5) {
            System.out.print(machten + " ");
        }
        System.out.println("\n");
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }
    }
}