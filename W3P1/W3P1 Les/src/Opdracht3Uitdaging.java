import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 3/10/2022
 */
public class Opdracht3Uitdaging {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int scrabbleWaarde = 0, count = 0;
        System.out.print("Vul hier een woord in en we berekenen de Scrabble-waarde: ");
        String woord = key.nextLine();
        String woordUpper = woord.toUpperCase();
        for (int i = 0; i < woordUpper.length(); i++) {
            String tempLetter = String.valueOf(woordUpper.charAt(i));
            switch (tempLetter) {
                case "A", "E", "I", "O", "U", "L", "N", "S", "T", "R" -> scrabbleWaarde = scrabbleWaarde + 1;
                case "D", "G" -> scrabbleWaarde = scrabbleWaarde + 2;
                case "B", "C", "M", "P" -> scrabbleWaarde = scrabbleWaarde + 3;
                case "F", "H", "V", "W", "Y" -> scrabbleWaarde = scrabbleWaarde + 4;
                case "K" -> scrabbleWaarde = scrabbleWaarde + 5;
                case "J", "X" -> scrabbleWaarde = scrabbleWaarde + 8;
                case "Q", "Z" -> scrabbleWaarde = scrabbleWaarde + 10;
            }
        }
        System.out.println("Dit woord " + woord + " heeft als Scrabble-waarde: " + scrabbleWaarde);
    }
}