import java.util.Scanner;

/**
 @author Elias De Hondt
 * 23/09/2022
 */
public class StartToRun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Hier worden een paar variabelen gedefinieerd.
        double maximalehartslag = 0, trainthartslag = 0;
        // De applicaties stelt zichzelf voor.
        System.out.println("Deze applicatie berekent je ideale trainingshartslag aan de hand van de formule van Karvonen.");
        // De leeftijd wordt gevraagd als input.
        System.out.print("Geef je leeftijd: ");
        double leeftijd = keyboard.nextDouble();
        // De hartslag In de rust wordt gevraagd als input.
        System.out.print("Geef je hartslag in rust: ");
        double rusthartslag = keyboard.nextDouble();
        // Er wordt gevraagd voor een keuze te maken (wat voor training wil je doen).
        System.out.println("Welk soort training wil je doen?");
        System.out.println("1 : recuperatie training");
        System.out.println("2 : LSD training (Long Slow Distance)");
        System.out.println("3 : extensieve uithouding");
        System.out.println("4 : intensieve uithouding");
        System.out.println("5 : tempo-interval");
        System.out.println("6 : intensieve interval");
        System.out.print("Maak je keuze: ");
        int keuze = keyboard.nextInt();
        // De maximale hartslag wordt doorrekent.
        maximalehartslag = 220 - leeftijd;
        // Er zijn hier 6 if statements elke if statement is gelinkt aan een keuze.
        if (keuze == 1) {
            trainthartslag = rusthartslag + (maximalehartslag - rusthartslag) * 0.65;
        }
        if (keuze == 2) {
            trainthartslag = rusthartslag + (maximalehartslag - rusthartslag) * 0.70;
        }
        if (keuze == 3) {
            trainthartslag = rusthartslag + (maximalehartslag - rusthartslag) * 0.75;
        }
        if (keuze == 4) {
            trainthartslag = rusthartslag + (maximalehartslag - rusthartslag) * 0.85;
        }
        if (keuze == 5) {
            trainthartslag = rusthartslag + (maximalehartslag - rusthartslag) * 0.90;
        }
        if (keuze == 6) {
            trainthartslag = rusthartslag + (maximalehartslag - rusthartslag) * 0.95;
        }
        // Het programma heeft de berekening gemaakt en print de output.
        System.out.println("Je maximale hartslag is " + maximalehartslag + ".");
        System.out.println("Je traint best met een hartslag rond de " + trainthartslag + ".");
    }
}
