import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Van Elias De Hondt
 * 17/11/2022
 */
public class Vrijdag_De_Dertiende {
    public static void main(String[] args) {
        DateTimeFormatter myFormatEDMY = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        LocalDate date1 = LocalDate.of(2020,1,1);
        LocalDate date2 = LocalDate.of(2029,12,31);
        while (date1.getDayOfMonth() <= date2.getDayOfMonth() && date1.getYear() <= date2.getYear()) {
            if (date1.getDayOfMonth() == 13 && date1.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.println(myFormatEDMY.format(date1));
            }
            date1 = date1.plusDays(1);
        }
    }
}