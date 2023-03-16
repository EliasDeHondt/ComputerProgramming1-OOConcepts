import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 17/11/2022
 */
public class Leeftijd {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        // Vraag data aan user.
        System.out.print("Geef je geboortedag: ");
        int dag = key.nextInt();
        System.out.print("Geef je geboortemaand: ");
        int maand = key.nextInt();
        System.out.print("Geef je geboortejaar: ");
        int jaar = key.nextInt();
        // Berekening.
        LocalDate geboorteData = LocalDate.of(jaar,maand,dag);
        LocalDate nu = LocalDate.now();
        int jaarp = Period.between(geboorteData, nu).getYears();
        int maandp = Period.between(geboorteData, nu).getMonths();
        int dagp = Period.between(geboorteData, nu).getDays();
        System.out.printf("Je bent nu %d jaren %d maanden en %d dagen oud.\n",jaarp,maandp,dagp);
        System.out.printf("Je bent geboren op een %s",geboorteData.getDayOfWeek());
    }
}
