import java.util.Scanner;

/**
 * @author Elias De Hondt
 * 3/10/2022
 */
public class Opdracht3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Vul hier een letter in en we berekenen de Scrabble-waarde: ");
        String letter = key.nextLine();
        switch (letter.toUpperCase()) {
            case "A", "E", "I", "O", "U", "L", "N", "S", "T", "R" ->
                    System.out.println("De Scrabble-waarde van " + letter + " is 1.");
            case "D", "G" -> System.out.println("De Scrabble-waarde van " + letter + " is 2.");
            case "B", "C", "M", "P" -> System.out.println("De Scrabble-waarde van " + letter + " is 3.");
            case "F", "H", "V", "W", "Y" -> System.out.println("De Scrabble-waarde van " + letter + " is 4.");
            case "K" -> System.out.println("De Scrabble-waarde van " + letter + " is 5.");
            case "J", "X" -> System.out.println("De Scrabble-waarde van " + letter + " is 8.");
            case "Q", "Z" -> System.out.println("De Scrabble-waarde van " + letter + " is 10.");
        }
    }
}
