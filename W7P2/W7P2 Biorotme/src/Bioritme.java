import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 17/11/2022
 */
public class Bioritme {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        // Vraag data aan user.
        System.out.print("Geef je geboortedag: ");
        int dag = key.nextInt();
        System.out.print("Geef je geboortemaand: ");
        int maand = key.nextInt();
        System.out.print("Geef je geboortejaar: ");
        int jaar = key.nextInt();

        // Aantal dagen berekenen tussen "geboorteDate" en "vandaag".
        LocalDate vandaag = LocalDate.now();
        LocalDate geboorteDate = LocalDate.of(jaar,maand,dag);
        long dagenOud = ChronoUnit.DAYS.between(geboorteDate,vandaag);

        // Print
        System.out.printf("\nJe bent vandaag %d dagen oud.\n", dagenOud);

        // Bioritme berekening.
        double fysiek = Math.abs(Math.sin(dagenOud / 23.0 * 2 * Math.PI));
        double emotioneel = Math.abs(Math.sin(dagenOud / 28.0 * 2 * Math.PI));
        double intellectueel = Math.abs(Math.sin(dagenOud / 33.0 * 2 * Math.PI));

        // Print
        System.out.println("Je bioritmes zijn:");
        // Fysiek
        System.out.print("- fysiek: ");
        Bioritme(fysiek);

        // Fysiek
        System.out.print("- emotioneel: ");
        Bioritme(emotioneel);

        // Fysiek
        System.out.print("- intellectueel: ");
        Bioritme(intellectueel);

    }
    // Methods
    private static void Bioritme(double data) {
        if (data >= 0 && data < 0.2) System.out.println("kritieke waarde");
        if (data >= 0.2 && data < 0.5) System.out.println("oké");
        if (data >= 0.5 && data < 0.8) System.out.println("goed");
        if (data > 0.8) System.out.println("topconditie");
    }
}
