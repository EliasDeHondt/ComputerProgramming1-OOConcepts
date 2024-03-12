import java.util.Scanner;

/**
 @author Elias De Hondt
 * 10/10/2022
 */
public class SpelenMetStrings {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Geef een zin in: ");
        String zin = key.nextLine();
        // Druk het aantal tekens af (inclusief spaties en leestekens).
        System.out.println("Er zijn " + zin.length() + " tekens in deze zin.");
        // Druk de zin in hoofdletters af.
        System.out.println(zin.toUpperCase());
        // Druk de zin in kleine letters af.
        System.out.println(zin.toLowerCase());
        // Druk het eerste karakter af.
        System.out.println("Het eerste karakter is een ‘" + zin.charAt(0) + "’.");
        // Druk het laatste karakter af.
        System.out.println("Het laatste karakter is een ‘" + zin.charAt(zin.length()-1) + "’.");
        // Druk het aantal tekens af zonder de spaties mee te tellen.
        String temp1 = zin.replaceAll("\\s", "");
        System.out.println("Er zijn " + temp1.length() + " karakters als je de spaties niet meetelt.");
        // Vervang alle karakters ‘e’ door ‘_’.
        System.out.println(zin.replaceAll("e", "_"));
        // Druk de zin af, zonder spaties.
        System.out.println(zin.replaceAll("\\s", ""));
        // Druk de zin af, zonder klinkers.
        System.out.println(zin.replaceAll("[aeiou]", ""));
    }
}
