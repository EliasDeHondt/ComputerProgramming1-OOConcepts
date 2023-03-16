import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 @author Van Elias De Hondt
 * 17/11/2022
 */
public class Opdracht_Datums {
    public static void main(String[] args) {
        System.out.println("-------------------------------");

        // Wat is de Date Time
        LocalDateTime nu1 = LocalDateTime.now();
        // Formatter voor de String
        DateTimeFormatter myFormat1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
        // Print
        System.out.printf("Het is vandaag %s\n",myFormat1.format(nu1));

        // Wat is de Date Time
        LocalDate nu2 = LocalDate.now();
        // plus 1000
        nu2 = nu2.plusDays(1000);
        // Formatter voor de String
        DateTimeFormatter myFormat2 = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        // Print
        System.out.printf("Binnen 1000 dagen is het %s\n",myFormat2.format(nu2));

        System.out.println("-------------------------------");

        LocalDate datum2 = LocalDate.of(2020, 1,1);

        System.out.println("De schrikkeljaren tussen 1995 en 2020 zijn:");

        for (LocalDate datum1 = LocalDate.of(1995, 1,1);
             datum1.isBefore(datum2); datum1 = datum1.plusYears(1)) {

            if (datum1.isLeapYear()) {
                System.out.print(datum1.getYear() + " ");
            }

        }
        System.out.println("\n-------------------------------");
    }
}
