/**
 * Van Elias De Hondt
 * 3/10/2022
 */
public class Opdracht4 {
    public static void main(String[] args) {
        int getal = 120;
        while (getal >= 100) {
            System.out.print(getal + " ");
            --getal;
        }
        System.out.println("\n");
        int veelvouden = 3;
        while (veelvouden < 50) {
            System.out.print(veelvouden + " ");
            veelvouden += 3;
        }
        System.out.println("\n");
        int machten = 1;
        while (machten < 10000) {
            System.out.print(machten + " ");
            machten *= 5;
        }
        System.out.println("\n");
        char letter = 'A';
        while (letter <= 'Z') {
            System.out.print(letter + " ");
            letter++;
        }
    }
}
