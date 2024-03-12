import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 @author Elias De Hondt
 * 17/11/2022
 */

public class Wapenstilstand {
    public static void main(String[] args) {
        // Vraag 1
        LocalDate date1 = LocalDate.of(1918,11,11);
        System.out.printf("Wapenstilstand (11/11/1918) viel op een: %s\n\n", date1.getDayOfWeek());
        // Vraag 2
        System.out.println("In deze jaren valt wapenstilstand op een zondag:");
        LocalDate date2 = LocalDate.of(1980,11,11);
        int[] jaar = new int[10];
        int j = 0;
        for (int i = date2.getYear(); i <= 2050; i++) {
            if (date2.getDayOfWeek() == DayOfWeek.SUNDAY) jaar[j++] = i;
            date2 = date2.plusYears(1);
        }
        for (int jaartal : jaar) {
            System.out.print(jaartal + " ");
        }
    }
}